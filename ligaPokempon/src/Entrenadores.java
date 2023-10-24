/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Entrenadores {

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

}
