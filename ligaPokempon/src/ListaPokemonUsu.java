/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class ListaPokemonUsu {

   protected NodoListaPokemon cabeza;

    public void inserta(Pokemon p) {
        
        if (cabeza == null) {
            cabeza = new NodoListaPokemon(p);
        } else {
            NodoListaPokemon aux = cabeza;
            NodoListaPokemon temp=new NodoListaPokemon(p);
            while (aux.getSiguiente()!=null) {
                aux=aux.getSiguiente();
            }
           aux.setSiguiente(temp);
  
        }
    }

    public String toString() {
        NodoListaPokemon aux = cabeza;
        String s = "Lista: \n";
        while (aux != null) {
            s += aux + " ";
            aux = aux.getSiguiente();

        }
        return s;
    }
      
}
