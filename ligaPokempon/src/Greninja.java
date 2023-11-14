
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class Greninja extends Pokemon implements IAgua {

    public Greninja() {
        nomPokemon = "Greninja";
        vida = 190;
        ataque = 55;
        defensa = 45;
        ataqueEsp = 75;
        defensaEsp = 65;
    }

    @Override
    public int ataqueHidroBomba(Pokemon defensor) {
        int danioBase = 25;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa HidroBomba y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataqueSurf(Pokemon defensor) {
        int danioBase = 35;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa HidroBomba y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    // Ataques físicos de tipo Agua
    @Override
    public int ataqueMartillazo(Pokemon defensor) {
        int danioBase = 20;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Aqua Cola y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataqueAquaCola(Pokemon defensor) {

        int danioBase = 30;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Aqua Cola y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public String toString() {
        return "Greninja";
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
    public double calcularMultiplicador(Pokemon defensor) {
        if (defensor instanceof IFuego) {
            return 1.5; 
        } else if (defensor instanceof INormal) {
            return 0.5; 
        } else {
            return 1.0; 
        }
    }

    @Override
    public int elegirAtaqueAleatorio(Pokemon defensor) {
        int eleccion=(int) (Math.random() * 4);
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
