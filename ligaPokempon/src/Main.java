
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
public class Main {

    public static void main(String[] args) {
        EntrenadorUsu entrenadorUsuario = new EntrenadorUsu("Brandon");
        Entrenadores entrenadorAdversario = new Entrenadores("Gary");

 
        agregarPokemonesAleatorios(entrenadorAdversario);
        

        System.out.println("\nPokémon de " + entrenadorAdversario.getNombre() + ":");
        mostrarPokemones(entrenadorAdversario);
        
           seleccionarPokemonsUsu(entrenadorUsuario);
        System.out.println("\nPokémon de " + entrenadorUsuario.getNombre()+ ":");
        mostrarPokemones(entrenadorUsuario);
        
        Batalla b1=new Batalla(entrenadorUsuario, entrenadorAdversario);
        b1.iniciarBatalla();
    }

    private static void agregarPokemonesAleatorios(Entrenadores entrenador) {
        int sumador = 0;
        while (sumador != 4) {
            Pokemon pokemonAleatorio = PokemonAleatorios.generarPokemonAleatorio();
            NodoPokemon aux = entrenador.getConjuntoPokemons().top;
            boolean esta = false;
            while (aux != null) {
                if (aux.getPokemon().nomPokemon.equals(pokemonAleatorio.nomPokemon)) {
                    esta = true;
                }
                aux = aux.getSiguiente();
            }
            if (esta == false) {
                entrenador.getConjuntoPokemons().apilar(pokemonAleatorio);
                sumador += 1;
            }
        }

    }

    private static void mostrarPokemones(Entrenadores entrenador) {
        PilaPokemon conjuntoPokemon = entrenador.getConjuntoPokemons();
        NodoPokemon actual = conjuntoPokemon.top;
        while (actual != null) {
            System.out.println(actual.getPokemon().getNomPokemon());
            actual = actual.getSiguiente();
        }
    }

    private static void mostrarPokemones(EntrenadorUsu entrenador) {
        ListaPokemonUsu equipoPokemon = entrenador.getPokemons();
        NodoListaPokemon actual = equipoPokemon.cabeza;
        while (actual != null) {
            System.out.println(actual.getPokemon().getNomPokemon());
            actual = actual.getSiguiente();
        }
    }

    private static void seleccionarPokemonsUsu(EntrenadorUsu entrenador) {
        int sumador = 0;
        while (sumador != 4) {
            Pokemon pokemonSeleccionado = PokemonAleatorios.seleccionarPokemon();
            NodoListaPokemon aux = entrenador.getPokemons().cabeza;
            boolean esta = false;
            while (aux != null) {
                if (aux.getPokemon().nomPokemon.equals(pokemonSeleccionado.nomPokemon)) {
                    esta = true;
                    JOptionPane.showMessageDialog(null, "El pokemon ya se encuentra en su Pokedex");
                }
                aux = aux.getSiguiente();
            }
            if (esta == false) {
                entrenador.getPokemons().inserta(pokemonSeleccionado);
                sumador += 1;
            }
        }

    }

}
