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
        Pokemon Charizard = new Charizard();
        Pokemon Gyarados = new Gyarados();
        Pokemon Typlosion = new Typlosion();
        Pokemon Snorlax = new Snorlax();
        Pokemon Oranguru = new Oranguru();
        Pokemon Greninja = new Greninja();
        Pokemon Arcanine = new Arcanine();
        Pokemon Swampert = new Swampert();
        Pokemon Ursaring = new Ursaring();

        Entrenadores entrenador1 = new Entrenadores("Ash");


        entrenador1.getConjuntoPokemons().apilar(Charizard);
        entrenador1.getConjuntoPokemons().apilar(Gyarados);
        entrenador1.getConjuntoPokemons().apilar(Arcanine);
        entrenador1.getConjuntoPokemons().apilar(Ursaring);

        System.out.println(entrenador1.toString());
    }
}
