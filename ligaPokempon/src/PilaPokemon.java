/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class PilaPokemon {

    protected NodoPokemon top;

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
        if (top != null) {
            Pokemon pokemonDesapilado = top.getPokemon();
            top = top.getSiguiente();
            return pokemonDesapilado;
        } else {

            System.out.println("La pila está vacía");
            return null;
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
       public void eliminarPokemon(){
           if(!top.getPokemon().estaVivo()){
               top=top.getSiguiente();
           }
       }
}
