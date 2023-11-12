
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Entrenadores extends PilaPokemon {

    private String nombre;
    private PilaPokemon conjuntoPokemons;

    public Entrenadores(String nombre) {
        this.nombre = nombre;
        this.conjuntoPokemons = new PilaPokemon();

    }

    public PilaPokemon getConjuntoPokemons() {
        return conjuntoPokemons;
    }

    public void setConjuntoPokemons(PilaPokemon conjuntoPokemons) {
        this.conjuntoPokemons = conjuntoPokemons;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entrenador " + nombre +"\n"+ "Pokemons \n" + conjuntoPokemons +"\n _____________________________";
    }
public boolean tienePokemonVivo() {
        NodoPokemon actual = top;

        while (actual != null) {
            if (actual.getPokemon().estaVivo()) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

         public Pokemon elegirPokemonParaBatalla() {
        // Implementa lógica para seleccionar un Pokémon, por ejemplo, el primero de la lista
        if (conjuntoPokemons != null && conjuntoPokemons.top.getPokemon() != null) {
            return conjuntoPokemons.top.getPokemon();  // Suponiendo que getCabeza() devuelve el primer nodo de la lista
        } else {
            // Manejo de caso en el que no hay Pokémon disponibles
            System.out.println("No hay Pokémon disponibles para la batalla.");
            return null;
        }
    }
   public int elegirAtaqueAleatorio() {
        Random rand = new Random();
        int opcionAleatoria = rand.nextInt(4) + 1; // Número aleatorio entre 1 y 4

        // Puedes imprimir un mensaje para indicar la elección aleatoria (opcional)
        System.out.println("El entrenador " + nombre + " eligió aleatoriamente el ataque " + opcionAleatoria);

        return opcionAleatoria;
    }
}
