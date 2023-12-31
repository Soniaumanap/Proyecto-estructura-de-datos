
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class Gyarados extends Pokemon implements IAgua {

    public Gyarados() {
        nomPokemon = "Gyarados";
        vidaMaxima = 190;
        vida = 190;
        ataque = 55;
        defensa = 45;
        ataqueEsp = 75;
        defensaEsp = 65;
    }

    @Override
    public int ataqueHidroBomba(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 90;
            danioTotal = (danioBase + getAtaqueEsp()) - defensor.defensaEsp;

            System.out.println(getNomPokemon() + " usa HidroBomba y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public int ataqueSurf(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);

            int danioBase = 90;
            danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;

            System.out.println(getNomPokemon() + " usa HidroBomba y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    // Ataques físicos de tipo Agua
    @Override
    public int ataqueMartillazo(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);

            int danioBase = 70;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;

            System.out.println(getNomPokemon() + " usa Aqua Cola y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public int ataqueAquaCola(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 80;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;

            System.out.println(getNomPokemon() + " usa Aqua Cola y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public String toString() {
        return "Gyarados";
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public int elegirAtaque(Pokemon defensor) {
        String[] opciones = {"Hidro Bomba", "Surf", "Martillazo", "Aqua Cola"};

        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case "Hidro Bomba":
                return ataqueHidroBomba(defensor);
            case "Surf":
                return ataqueSurf(defensor);
            case "Martillazo":
                return ataqueMartillazo(defensor);
            case "Aqua Cola":
                return ataqueAquaCola(defensor);
            default:
                return 0;
        }
    }

    @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
    }

    @Override
    public void calcularMultiplicador(Pokemon defensor) {
        if (defensor instanceof IFuego) {
            this.ataqueEsp = 85;
            this.defensaEsp = 75;
        } else {
            this.ataqueEsp = 75;
            this.defensaEsp = 65;
        }

    }

    @Override
    public int elegirAtaqueAleatorio(Pokemon defensor) {
        int eleccion = (int) (Math.random() * 4);
        switch (eleccion) {
            case 0:
                return ataqueHidroBomba(defensor);
            case 1:
                return ataqueSurf(defensor);
            case 2:
                return ataqueMartillazo(defensor);
            case 3:
                return ataqueAquaCola(defensor);
            default:
                return 0;
        }
    }
}
