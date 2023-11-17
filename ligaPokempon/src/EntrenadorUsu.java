
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class EntrenadorUsu {

    private String nombre;
    private ListaPokemonUsu pokemons;
    private Pokemon pokemonActual; // Nuevo atributo para rastrear el Pokémon actual

    public EntrenadorUsu(String nombre) {
        this.nombre = nombre;
        this.pokemons = new ListaPokemonUsu();
        this.pokemonActual = null;
    }

    public Pokemon getPokemonActual() {
        return pokemonActual;
    }

    public void setPokemonActual(Pokemon pokemonActual) {
        this.pokemonActual = pokemonActual;
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
        NodoListaPokemon actual = pokemons.cabeza;
        boolean vivo = false;
        while (actual != null) {
            if (actual.getPokemon().estaVivo()) {
                vivo = true;
            }
            actual = actual.getSiguiente();
        }
        return vivo;
    }

public Pokemon elegirPokemonParaBatalla() {
        if (pokemonActual != null && !pokemonActual.estaVivo()) {
            System.out.println("¡Tu Pokémon actual ha muerto! Debes seleccionar uno nuevo.");
            pokemonActual = null;
        }

        if (pokemonActual == null) {
            pokemonActual = seleccionarNuevoPokemon();
        }

        return pokemonActual;
    }

    private Pokemon seleccionarNuevoPokemon() {
        NodoListaPokemon actual = pokemons.cabeza;
        int contador = 0;

        while (actual != null) {
            if (actual.getPokemon().estaVivo()) {
                contador++;
            }
            actual = actual.getSiguiente();
        }

        if (contador > 0) {
            String[] opciones = new String[contador];
            int i = 0;
            actual = pokemons.cabeza;
            while (actual != null) {
                if (actual.getPokemon().estaVivo()) {
                    opciones[i] = actual.getPokemon().getNomPokemon();
                    i++;
                }
                actual = actual.getSiguiente();
            }

            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Selecciona un Pokémon para la batalla:",
                    "Elegir Pokémon",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            actual = pokemons.cabeza;
            while (actual != null) {
                if (actual.getPokemon().getNomPokemon().equals(seleccion)) {
                    return actual.getPokemon();
                }
                actual = actual.getSiguiente();
            }
        }

        System.out.println("No hay Pokémon vivos disponibles para la batalla.");
        return null;
    }
}