/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class ColaTorneo {
    private NodoEntrenadores frente;
    private NodoEntrenadores ultimo;

    public void encola(Entrenadores entrenador) {
        NodoEntrenadores d=new NodoEntrenadores(entrenador);
        if (frente == null) {
            frente = d;
            ultimo = d;
        } else {
            ultimo.setAtras(d);
            ultimo = d;
        }
    }

    public NodoEntrenadores atiende() {
        NodoEntrenadores aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        NodoEntrenadores aux = frente;
        while (aux != null) {
            s.append(aux).append("\n");
            aux = aux.getAtras();
        }
        return s.toString();
    }
    public int tamano() {
    int count = 0;
    NodoEntrenadores actual = frente;
    while (actual != null) {
        count++;
        actual = actual.getAtras();
    }
    return count;
}
}
