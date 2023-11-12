/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class NodoListaPokemon {

    private Pokemon pokemon;
    private NodoListaPokemon siguiente;

    public NodoListaPokemon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaPokemon siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.siguiente = null;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

}

