/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class NodoEntrenadores {

    private Entrenadores entrenador;
    private NodoEntrenadores atras;

    public NodoEntrenadores(Entrenadores entrenador) {
        this.entrenador = entrenador;
        this.atras = null;
    }

    public Entrenadores getEntrenador() {
        return entrenador;
    }

    public NodoEntrenadores getAtras() {
        return atras;
    }

    public void setAtras(NodoEntrenadores atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Entrenador: " + entrenador.getNombre();
    }
}


