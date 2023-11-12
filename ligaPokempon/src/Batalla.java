/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
import java.util.Random;

public class Batalla {

    private EntrenadorUsu entrenadorUsuario;
    private Entrenadores entrenadorAdversario;

    public Batalla(EntrenadorUsu entrenadorUsuario, Entrenadores entrenadorAdversario) {
        this.entrenadorUsuario = entrenadorUsuario;
        this.entrenadorAdversario = entrenadorAdversario;
    }

   public void iniciarBatalla() {
    System.out.println("¡Comienza la batalla!");

    while (entrenadorUsuario.tienePokemonVivo() && entrenadorAdversario.tienePokemonVivo()) {
        System.out.println("Inicia un nuevo turno.");

        Pokemon pokemonUsuario = entrenadorUsuario.elegirPokemonParaBatalla();
        Pokemon pokemonAdversario = entrenadorAdversario.elegirPokemonParaBatalla();

            System.out.println("El entrenador " + entrenadorUsuario.getNombre() + " envía a " + pokemonUsuario.getNomPokemon() + " a la batalla.");
            System.out.println("El entrenador " + entrenadorAdversario.getNombre() + " envía a " + pokemonAdversario.getNomPokemon() + " a la batalla.");

            realizarTurno(pokemonUsuario, pokemonAdversario);
        }

        determinarGanador();
    }

     private void realizarTurno(Pokemon pokemonUsuario, Pokemon pokemonAdversario) {
        // Lógica para determinar qué ataque realiza el usuario
        int ataqueUsuario = pokemonUsuario.elegirAtaque();

       
        int ataqueAdversario = entrenadorAdversario.elegirAtaqueAleatorio();

        // Calcular el daño causado por los ataques
        int danioUsuario = calcularDanio(pokemonUsuario, ataqueUsuario, pokemonAdversario);
        int danioAdversario = calcularDanio(pokemonAdversario, ataqueAdversario, pokemonUsuario);

        // Aplicar el daño a los Pokémon
        pokemonUsuario.recibirDanio(danioUsuario);
        pokemonAdversario.recibirDanio(danioAdversario);

        // Mostrar información sobre el turno
        System.out.println(pokemonUsuario.getNomPokemon() + " realiza " + obtenerNombreAtaque(pokemonUsuario, ataqueUsuario) + " y causa " + danioUsuario + " de daño.");
        System.out.println(pokemonAdversario.getNomPokemon() + " realiza " + obtenerNombreAtaque(pokemonAdversario, ataqueAdversario) + " y causa " + danioAdversario + " de daño.");

        // Mostrar el estado actual de los Pokémon
        System.out.println("Estado actual de " + pokemonUsuario.getNomPokemon() + ": " + pokemonUsuario.getVida() + " HP");
        System.out.println("Estado actual de " + pokemonAdversario.getNomPokemon() + ": " + pokemonAdversario.getVida() + " HP");
    }

  private int calcularDanio(Pokemon atacante, int ataque, Pokemon defensor) {
    

    Random rand = new Random();
    int danioBase = rand.nextInt(10) + 1; 
    int danioTotal = danioBase + atacante.getAtaque();

    double multiplicadorTipo = atacante.calcularMultiplicador(defensor);
    danioTotal = (int) (danioTotal * multiplicadorTipo);

    return danioTotal;
}

    private String obtenerNombreAtaque(Pokemon pokemon, int codigoAtaque) {
        switch (codigoAtaque) {
            case 1:
                return pokemon instanceof IFuego ? "Lanzallamas" : "HidroBomba"; // Adaptar según los tipos de Pokémon
            case 2:
                return pokemon instanceof IFuego ? "Anillo Ígneo" : "Surf"; // Adaptar según los tipos de Pokémon
            case 3:
                return pokemon instanceof IFuego ? "Colmillo Ígneo" : "Martillazo"; // Adaptar según los tipos de Pokémon
            case 4:
                return pokemon instanceof IFuego ? "Puño Fuego" : "Aqua Cola"; // Adaptar según los tipos de Pokémon
            default:
                return "Ataque #" + codigoAtaque;
        }
    }

    private void determinarGanador() {
        if (entrenadorUsuario.tienePokemonVivo()) {
            System.out.println("¡El entrenador " + entrenadorUsuario.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("¡El entrenador " + entrenadorAdversario.getNombre() + " ha ganado la batalla!");
        }
    }
}
