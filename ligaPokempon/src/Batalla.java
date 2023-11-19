/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Batalla {

    private final EntrenadorUsu entrenadorUsuario;
    private final Entrenadores entrenadorAdversario;
    private Object ganador;

    public Object getGanador() {
        return ganador;
    }

    public Batalla(EntrenadorUsu entrenadorUsuario, Entrenadores entrenadorAdversario) {
        this.entrenadorUsuario = entrenadorUsuario;
        this.entrenadorAdversario = entrenadorAdversario;
    }

    public void iniciarBatalla() {
        System.out.println("¡Comienza la batalla!");
        Pokemon pokemonUsuario = entrenadorUsuario.elegirPokemonParaBatalla();
        Pokemon pokemonAdversario = entrenadorAdversario.elegirPokemonParaBatalla();
        System.out.println("El entrenador " + entrenadorUsuario.getNombre() + " envía a " + pokemonUsuario.getNomPokemon() + " a la batalla.");
        System.out.println("El entrenador " + entrenadorAdversario.getNombre() + " envía a " + pokemonAdversario.getNomPokemon() + " a la batalla.");
        while (entrenadorUsuario.tienePokemonVivo() && entrenadorAdversario.tienePokemonVivo()) {
            System.out.println("Inicia un nuevo turno.");

            realizarTurno(pokemonUsuario, pokemonAdversario);
            pokemonUsuario = entrenadorUsuario.elegirPokemonParaBatalla();
            pokemonAdversario = entrenadorAdversario.elegirPokemonParaBatalla();
        }

        determinarGanador();
        ganador = determinarGanador();
    }

    public void realizarTurno(Pokemon pokemonUsuario, Pokemon pokemonAdversario) {
        if (!pokemonUsuario.estaVivo()) {
            System.out.println(pokemonUsuario.getNomPokemon() + " no puede atacar. ¡Está fuera de combate!");
            return;
        } else {
            int danioUsuario = pokemonUsuario.elegirAtaque(pokemonAdversario);
            pokemonAdversario.recibirDanio(danioUsuario);

        }

        if (!pokemonAdversario.estaVivo()) {
            System.out.println(pokemonAdversario.getNomPokemon() + " no puede atacar. ¡Está fuera de combate!");
            return;
        } else {

            int danioAdversario = pokemonAdversario.elegirAtaqueAleatorio(pokemonUsuario);
            pokemonUsuario.recibirDanio(danioAdversario);
        }

        System.out.println("Estado actual de " + pokemonUsuario.getNomPokemon() + ": " + pokemonUsuario.getVida() + " HP");
        System.out.println("Estado actual de " + pokemonAdversario.getNomPokemon() + ": " + pokemonAdversario.getVida() + " HP");
    }

    private Object determinarGanador() {
        if (entrenadorUsuario.tienePokemonVivo()) {
            System.out.println("¡El entrenador " + entrenadorUsuario.getNombre() + " ha ganado la batalla!");
            return entrenadorUsuario;
        } else {
            System.out.println("¡El entrenador " + entrenadorAdversario.getNombre() + " ha ganado la batalla!");
            return entrenadorAdversario;
        }
    }
}
