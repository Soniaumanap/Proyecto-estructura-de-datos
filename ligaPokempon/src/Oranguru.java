
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
        vida = 150;
        ataque = 50;
        defensa = 35;
        ataqueEsp = 70;
        defensaEsp = 60;
    }

    @Override
    public int ataqueHiperrayo(Pokemon defensor) {
        int danioBase = 100;
        int danioTotal = (danioBase + getAtaqueEsp()) - defensor.defensaEsp;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Hiperrayo y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataqueMeteoronola(Pokemon defensor) {
        int danioBase = 100;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Meteorobola y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataquePisoton(Pokemon defensor) {
        int danioBase = 100;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Pisoton y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataqueVelocitdadExtrema(Pokemon defensor) {
        int danioBase = 100;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;

        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);

        System.out.println(getNomPokemon() + " usa Velocidad Extrema y causa " + danioTotal + " de daño.");
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
    public double calcularMultiplicador(Pokemon defensor) {
        if (defensor instanceof IFuego) {
            return 0.5; // Débil contra Fuego
        } else if (defensor instanceof IAgua) {
            return 1.5; // Fuerte contra Agua
        } else {
            return 1.0; // No hay multiplicador (neutral)
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
