
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class Typlosion extends Pokemon implements IFuego {

    public Typlosion() {
        nomPokemon = "Typlosion";
        vidaMaxima = 115;
        vida = 115;
        ataque = 50;
        defensa = 35;
        ataqueEsp = 70;
        defensaEsp = 60;
    }

    @Override
    public int ataqueLanzallamas(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 90;
            danioTotal = (danioBase + getAtaqueEsp()) - defensor.defensaEsp;
            System.out.println(getNomPokemon() + " usa Lanzallamas y causa " + danioTotal + " de daño.");

        }
        return danioTotal;
    }

    @Override
    public int ataqueAnilloIgneo(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 80;
            danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;
            System.out.println(getNomPokemon() + " usa Anillo Igneo y causa " + danioTotal + " de daño.");

        }
        return danioTotal;
    }

    @Override
    public int ataqueColmilloIgneo(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 65;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;

            System.out.println(getNomPokemon() + " usa Colmillo Igneo y causa " + danioTotal + " de daño.");

        }
        return danioTotal;
    }

    @Override
    public int ataquePuñoFuego(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 70;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;
            System.out.println(getNomPokemon() + " usa Puño Fuego y causa " + danioTotal + " de daño.");
            return danioTotal;
        }
        return danioTotal;
    }

    @Override
    public String toString() {
        return "Typlosion";
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public int elegirAtaque(Pokemon defensor) {
        String[] opciones = {"Lanzallamas", "Anillo Ígneo", "Colmillo Ígneo", "Puño Fuego"};

        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case "Lanzallamas":
                return ataqueLanzallamas(defensor);
            case "Anillo Ígneo":
                return ataqueAnilloIgneo(defensor);
            case "Colmillo Ígneo":

                return ataqueColmilloIgneo(defensor);
            case "Puño Fuego":

                return ataquePuñoFuego(defensor);
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
        if (defensor instanceof INormal) {
            this.ataqueEsp = 85;
            this.defensaEsp = 70;
        } else {
            this.ataqueEsp = 80;
            this.defensaEsp = 70;
        }
    }

    @Override
    public int elegirAtaqueAleatorio(Pokemon defensor) {

        int eleccion = (int) (Math.random() * 4);;

        switch (eleccion) {
            case 0:
                return ataqueLanzallamas(defensor);
            case 1:
                return ataqueAnilloIgneo(defensor);
            case 2:

                return ataqueColmilloIgneo(defensor);
            case 3:

                return ataquePuñoFuego(defensor);

            default:
                return 0;
        }
    }
}
