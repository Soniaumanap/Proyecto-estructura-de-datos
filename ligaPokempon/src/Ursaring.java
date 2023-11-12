
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Ursaring extends Pokemon implements INormal {
     public Ursaring() {
        nomPokemon="Ursaring";
        vida=150;
        ataque=50;
        defensa=35;
        ataqueEsp=70;
        defensaEsp=60;
    }
       
    @Override
    public int ataqueHiperrayo() {
        int danio=0;
        return danio;

    }

    @Override
    public int ataqueMeteoronola() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataquePisoton() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataqueVelocitdadExtrema() {
                int danio=0;
        return danio;
    }

    @Override
    public String toString() {
        return "Ursaring";
    }
    public boolean estaVivo() {
    return vida > 0;
}
 public int elegirAtaque() {
        String[] opciones = {"Hiperrayo", "Meteoronola", "Pisotón", "Velocidad Extrema"};
        
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case "Hiperrayo":
                return ataqueHiperrayo();
            case "Meteoronola":
                return ataqueMeteoronola();
            case "Pisotón":
                return ataquePisoton();
            case "Velocidad Extrema":
                return ataqueVelocitdadExtrema();
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
}
