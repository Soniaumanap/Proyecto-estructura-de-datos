/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class EntrenadorUsu extends ListaPokemonUsu{
    private String nombre;
    private ListaPokemonUsu pokemons;

    public EntrenadorUsu(String nombre) {
        this.nombre = " ";
        this.pokemons = new ListaPokemonUsu();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaPokemonUsu getPokemons() {
        return pokemons;
    }

    public void setPokemons(ListaPokemonUsu pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "EntrenadorUsu{" + "nombre=" + nombre + ", pokemons=" + pokemons + '}';
    }
    
public boolean tienePokemonVivo() {
        NodoListaPokemon actual = cabeza;

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
        if (pokemons != null && pokemons.cabeza != null) {
            return pokemons.cabeza.getPokemon();  // Suponiendo que getCabeza() devuelve el primer nodo de la lista
        } else {
            // Manejo de caso en el que no hay Pokémon disponibles
            System.out.println("No hay Pokémon disponibles para la batalla.");
            return null;
        }
    }
}
