

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author brand
 */
public class Main {

    public static void main(String[] args) {

//
        String nombre = JOptionPane.showInputDialog("Digite su nombre");
        Entrenadores entrenadorUsu = new Entrenadores(nombre);
        EntrenadorUsu entrenadorUsu2 = new EntrenadorUsu(nombre);
        ColaTorneo torneo = new ColaTorneo();
        torneo.encola(entrenadorUsu);
        seleccionarPokemonsUsu(entrenadorUsu2, entrenadorUsu);

        agregarEntrenadoresDePrueba(15, torneo);
        System.out.println(torneo.toString());

        ejecutarRonda(torneo, "Octavos de Final", entrenadorUsu2);

        System.out.println("¡El ganador del torneo es: " + torneo.atiende() + "!");
    }

    private static void agregarPokemonesAleatorios(Entrenadores entrenador) {
        int sumador = 0;
        while (sumador != 4) {
            Pokemon pokemonAleatorio = PokemonAleatorios.generarPokemonAleatorio();
            NodoPokemon aux = entrenador.getConjuntoPokemons().top;
            boolean esta = false;
            while (aux != null) {
                if (aux.getPokemon().nomPokemon.equals(pokemonAleatorio.nomPokemon)) {
                    esta = true;
                }
                aux = aux.getSiguiente();
            }
            if (esta == false) {
                entrenador.getConjuntoPokemons().apilar(pokemonAleatorio);
                sumador += 1;
            }
        }

    }

    private static void mostrarPokemones(Entrenadores entrenador) {
        PilaPokemon conjuntoPokemon = entrenador.getConjuntoPokemons();
        NodoPokemon actual = conjuntoPokemon.top;
        while (actual != null) {
            System.out.println(actual.getPokemon().getNomPokemon());
            actual = actual.getSiguiente();
        }
    }

    private static void mostrarPokemones(EntrenadorUsu entrenador) {
        ListaPokemonUsu equipoPokemon = entrenador.getPokemons();
        NodoListaPokemon actual = equipoPokemon.cabeza;
        while (actual != null) {
            System.out.println(actual.getPokemon().getNomPokemon());
            actual = actual.getSiguiente();
        }
    }

    private static void seleccionarPokemonsUsu(EntrenadorUsu entrenador, Entrenadores entrenadorUsu) {
        int sumador = 0;
        while (sumador != 4) {
            Pokemon pokemonSeleccionado = PokemonAleatorios.seleccionarPokemon();
            NodoListaPokemon aux = entrenador.getPokemons().cabeza;
            boolean esta = false;
            while (aux != null) {
                if (aux.getPokemon().nomPokemon.equals(pokemonSeleccionado.nomPokemon)) {
                    esta = true;
                    JOptionPane.showMessageDialog(null, "El pokemon ya se encuentra en su Pokedex");
                }
                aux = aux.getSiguiente();
            }
            if (esta == false) {
                entrenador.getPokemons().inserta(pokemonSeleccionado);
                sumador += 1;
            }
        }

    }

    public static void agregarEntrenadoresDePrueba(int cantidad, ColaTorneo torneo) {
        String[] nombres = {"Ash", "Gary", "Misty", "Brock", "May", "Dawn", "Red", "Blue", "Leaf", "Serena", "Cynthia", "Entrenador Pescador", "Ethan", "Lyra", "Suarez"};
        for (int i = 0; i < cantidad; i++) {

            Entrenadores entrenador = new Entrenadores(nombres[i]);
            agregarPokemonesAleatorios(entrenador);
            System.out.println(nombres[i]);
            mostrarPokemones(entrenador);
            System.out.println("--------------------");
            torneo.encola(entrenador);
        }

    }

    public static void ejecutarRonda(ColaTorneo cola, String nombreRonda, EntrenadorUsu entrenador) {
        System.out.println("---- " + nombreRonda + " ----");
        int partidos = cola.tamano() / 2;
        for (int i = 0; i < partidos; i++) {
            NodoEntrenadores equipo1 = cola.atiende();
            NodoEntrenadores equipo2 = cola.atiende();

            NodoEntrenadores ganador = simularBatalla(equipo1, equipo2, entrenador);

            cola.encola(ganador.getEntrenador());


            System.out.println("Combate " + (i + 1) + ": " + equipo1 + " vs " + equipo2 + " - Ganador: " + ganador);
        }


        if (cola.tamano() > 1) {
            ejecutarRonda(cola, "Siguiente Ronda", entrenador);
        }
    }

    public static NodoEntrenadores simularBatalla(NodoEntrenadores equipo1, NodoEntrenadores equipo2, EntrenadorUsu entrenador) {
        if (equipo1.getEntrenador().getNombre().equals(entrenador.getNombre())) {
            Batalla b1 = new Batalla(entrenador, equipo2.getEntrenador());
            b1.iniciarBatalla();
            entrenador.restaurarVidaPokemon();
            equipo1.getEntrenador().restaurarVidaPokemon();
            equipo2.getEntrenador().restaurarVidaPokemon();
            if (b1.getGanador() == entrenador) {
                return equipo1;
            } else {
                return equipo2;
            }
        } else if (equipo2.getEntrenador().getNombre().equals(entrenador.getNombre())) {
            Batalla b1 = new Batalla(entrenador, equipo1.getEntrenador());
            b1.iniciarBatalla();
            entrenador.restaurarVidaPokemon();
            equipo1.getEntrenador().restaurarVidaPokemon();
            equipo2.getEntrenador().restaurarVidaPokemon();
            if (b1.getGanador() == entrenador) {
                return equipo2;
            } else {
                return equipo1;
            } 
        } else {
            double probabilidad = Math.random();
            equipo1.getEntrenador().restaurarVidaPokemon();
            equipo2.getEntrenador().restaurarVidaPokemon();            
            return probabilidad > 0.5 ? equipo1 : equipo2;

        }
    }
}
