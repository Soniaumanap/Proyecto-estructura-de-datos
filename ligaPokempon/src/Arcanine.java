
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Arcanine extends Pokemon implements IFuego{
    public Arcanine() {
        nomPokemon="Arcanine";
        vida=115;
        ataque=50;
        defensa=35;
        ataqueEsp=70;
        defensaEsp=60;
    }
       
    @Override
    public int ataqueLanzallamas() {
        int danio=0;
        return danio;

    }

    @Override
    public int ataqueAnilloIgneo() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataqueColmilloIgneo() {
                int danio=0;
        return danio;
    }

    @Override
    public int ataquepuñoFuego() {
                int danio=0;
        return danio;
    }

    @Override
    public String toString() {
        return "Arcanine" ;
    }
    
    public boolean estaVivo() {
    return vida > 0;
}
    public int elegirAtaque() {
        String[] opciones = {"Lanzallamas", "Anillo Ígneo", "Colmillo Ígneo", "Puño Fuego"};
        
        // Mostrar un cuadro de diálogo con las opciones y obtener la elección del usuario
        String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        // Mapear la elección del usuario al código de ataque
        switch (eleccion) {
            case "Lanzallamas":
                return ataqueLanzallamas();
            case "Anillo Ígneo":
                return ataqueAnilloIgneo();
            case "Colmillo Ígneo":

                return ataqueColmilloIgneo();
            case "Puño Fuego":
    
                return ataquepuñoFuego();
            default:
                // En caso de opción no válida, podrías manejarlo de alguna manera (por ejemplo, volver a pedir la elección)
                return 0; // Puedes ajustar esto según tus necesidades
        }
    }
        @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
}
    
    @Override
    public double calcularMultiplicador(Pokemon defensor) {
        if (defensor instanceof INormal) {
            return 1.5; // Fuerte contra Normal
        } else if (defensor instanceof IAgua) {
            return 0.5; // Débil contra Agua
        } else {
            return 1.0; // No hay multiplicador (neutral)
        }
    }

}


