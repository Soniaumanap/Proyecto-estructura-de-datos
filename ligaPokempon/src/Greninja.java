
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Greninja extends Pokemon implements IAgua{
    public Greninja() {
        nomPokemon="Greninja";
        vida=190;
        ataque=55;
        defensa=45;
        ataqueEsp=75;
        defensaEsp=65;
    }
       
    @Override
    public int ataqueHidroBomba() {
        int danio=0;
        return danio;

    }

    @Override
    public int ataqueSurf() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataqueMartillazo() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataqueAquaCola() {
                int danio=0;
        return danio;
    }

    @Override
    public String toString() {
        return "Greninja" ;
    }
    public boolean estaVivo() {
    return vida > 0;
}
public int elegirAtaque() {
        String[] opciones = {"Hidro Bomba", "Surf", "Martillazo", "Aqua Cola"};
        
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        switch (eleccion) {
            case "Hidro Bomba":
                return ataqueHidroBomba();
            case "Surf":
                return ataqueSurf();
            case "Martillazo":
                return ataqueMartillazo();
            case "Aqua Cola":
                return ataqueAquaCola();
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
            return 1.5; // Fuerte contra Fuego
        } else if (defensor instanceof INormal) {
            return 0.5; // Débil contra Normal
        } else {
            return 1.0; // No hay multiplicador (neutral)
        }
    }

}


