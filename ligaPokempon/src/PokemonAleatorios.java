
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class PokemonAleatorios {
   

    public static Pokemon generarPokemonAleatorio() {
        
       int tipoPokemon = (int) (Math.random() * 9); 

        switch (tipoPokemon) {
            case 0:
                return new Charizard();
            case 1:
                return new Swampert();
            case 2:
                return new Ursaring();
            case 3:
                return new Arcanine();
            case 4:
                return new Typlosion();
            case 5:
                return new Snorlax();
            case 6:
                return new Greninja();
            case 7:
                return new Gyarados();
            case 8:
                return new Oranguru();
            
            default:
                return null;  
        }
    }
    
     public static Pokemon seleccionarPokemon() {
  String[] opciones = {"Charizard", "Swampert", "Ursaring", "Arcanine", "Typlosion", "Snorlax", "Greninja", "Gyarados", "Oranguru"};

        int eleccionIndice = JOptionPane.showOptionDialog(
                null,
                "Elige el número correspondiente al tipo de Pokémon:",
                "Seleccionar Pokémon",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

      
        if (eleccionIndice >= 0 && eleccionIndice < opciones.length) {
            switch (eleccionIndice) {
                case 0:
                    return new Charizard();
                case 1:
                    return new Swampert();
                case 2:
                    return new Ursaring();
                case 3:
                    return new Arcanine();
                case 4:
                    return new Typlosion();
                case 5:
                    return new Snorlax();
                case 6:
                    return new Greninja();
                case 7:
                    return new Gyarados();
                case 8:
                    return new Oranguru();
                default:
                    return null;
            }
        } else {
            return null; 
        }
    }
}



