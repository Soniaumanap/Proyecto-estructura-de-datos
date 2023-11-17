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

    public void setEntrenador(Entrenadores entrenador) {
        this.entrenador = entrenador;
    }

    public NodoEntrenadores getAtras() {
        return atras;
    }

    public void setAtras(NodoEntrenadores siguiente) {
        this.atras = siguiente;
    }
    
            
}
