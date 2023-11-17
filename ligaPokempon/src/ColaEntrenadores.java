/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class ColaEntrenadores {
      private NodoEntrenadores frente;
    private NodoEntrenadores finalCola;

    public ColaEntrenadores() {
        this.frente = null;
        this.finalCola = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(Entrenadores entrenador) {
        NodoEntrenadores nuevoNodo = new NodoEntrenadores(entrenador);
        if (estaVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.setAtras(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }

    public Entrenadores desencolar() {
        if (estaVacia()) {
            return null;
        } else {
            Entrenadores entrenadorDesencolado = frente.getEntrenador();
            frente = frente.getAtras();
            if (frente == null) {
                finalCola = null;
            }
            return entrenadorDesencolado;
        }
    }
        public String toString(){
        String s="";
        NodoEntrenadores aux =frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}

