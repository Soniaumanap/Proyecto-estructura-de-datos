/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class PilaPokemon {

    private NodoPokemon top;

    public PilaPokemon() {
        this.top = null;
    }

    public boolean esVacia() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(Pokemon pokemon) {
        NodoPokemon nuevoNodo = new NodoPokemon(pokemon);
        if (esVacia()) {
            top = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(top);
            top = nuevoNodo;
        }
    }

    public Pokemon desapilar() {
        if (esVacia()) {
            return null;
        } else {
            top = top.getSiguiente();
            Pokemon pokemonDesapilado = top.getPokemon();
            return pokemonDesapilado;
        }

    }
       public String toString(){
        String s="";
        if(!esVacia()){
            NodoPokemon aux = top;
            while (aux!=null){
                s=s+aux.getPokemon()+"\n";
                aux=aux.getSiguiente();
            }
        }
        return s;
    }

}
