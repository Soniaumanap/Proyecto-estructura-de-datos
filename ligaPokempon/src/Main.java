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
        EntrenadorUsu entrenadorUsuario = new EntrenadorUsu("Ash");
        Entrenadores entrenadorAdversario = new Entrenadores("Gary");

        Charizard pokemonAguaAdversario = new Charizard();
        Swampert charizardUsuario = new Swampert();
        // Agrega Pokémon a los entrenadores
        entrenadorUsuario.getPokemons().inserta(charizardUsuario);
        entrenadorAdversario.getConjuntoPokemons().apilar(pokemonAguaAdversario);

        // Crea la batalla y la inicia
        Batalla batalla = new Batalla(entrenadorUsuario, entrenadorAdversario);
        batalla.iniciarBatalla();
    }
}
