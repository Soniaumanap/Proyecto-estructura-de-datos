
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class Oranguru extends Pokemon implements INormal {

    public Oranguru() {
        nomPokemon = "Oranguru";
        vidaMaxima = 150;

        vida = 150;
        ataque = 50;
        defensa = 35;
        ataqueEsp = 70;
        defensaEsp = 60;
    }

    @Override
    public int ataqueHiperrayo(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);
            int danioBase = 100;
            danioTotal = (danioBase + getAtaqueEsp()) - defensor.defensaEsp;

            System.out.println(getNomPokemon() + " usa Hiperrayo y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public int ataqueMeteoronola(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);

            int danioBase = 90;
            danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;

            System.out.println(getNomPokemon() + " usa Meteorobola y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public int ataquePisoton(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);

            int danioBase = 80;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;

            System.out.println(getNomPokemon() + " usa Pisoton y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public int ataqueVelocitdadExtrema(Pokemon defensor) {
        int probabilidad = (int) (Math.random() * 10);
        int danioTotal;
        if (probabilidad == 5) {
            danioTotal = 0;
            System.out.println(getNomPokemon() + "fallo el ataque");
        } else {
            calcularMultiplicador(defensor);

            int danioBase = 90;
            danioTotal = (danioBase + getAtaque()) - defensor.defensa;

            System.out.println(getNomPokemon() + " usa Velocidad Extrema y causa " + danioTotal + " de daño.");
        }
        return danioTotal;
    }

    @Override
    public String toString() {
        return "Oranguru";
    }

    @Override
    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public int elegirAtaque(Pokemon defensor) {
        String[] opciones = {"Hiperrayo", "Meteoronola", "Pisotón", "Velocidad Extrema"};

        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case "Hiperrayo":
                return ataqueHiperrayo(defensor);
            case "Meteoronola":
                return ataqueMeteoronola(defensor);
            case "Pisotón":
                return ataquePisoton(defensor);
            case "Velocidad Extrema":
                return ataqueVelocitdadExtrema(defensor);
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
        if (defensor instanceof IAgua) {
            this.ataqueEsp = 75;
            this.defensaEsp = 65;
        } else {
            this.ataqueEsp = 70;
            this.defensaEsp = 60;
        }
    }

    @Override
    public int elegirAtaqueAleatorio(Pokemon defensor) {

        int eleccion = (int) (Math.random() * 4);

        switch (eleccion) {
            case 0:
                return ataqueHiperrayo(defensor);
            case 1:
                return ataqueMeteoronola(defensor);
            case 2:
                return ataquePisoton(defensor);
            case 3:
                return ataqueVelocitdadExtrema(defensor);

            default:
                return 0;
        }
    }
}
