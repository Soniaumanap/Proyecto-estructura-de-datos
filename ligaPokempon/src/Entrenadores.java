


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public class Entrenadores extends PilaPokemon {

    private String nombre;
    private PilaPokemon conjuntoPokemons;

    public Entrenadores(String nombre) {
        this.nombre = nombre;
        this.conjuntoPokemons = new PilaPokemon();

    }

    public PilaPokemon getConjuntoPokemons() {
        return conjuntoPokemons;
    }

    public void setConjuntoPokemons(PilaPokemon conjuntoPokemons) {
        this.conjuntoPokemons = conjuntoPokemons;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entrenador " + nombre +"\n"+ "Pokemons \n" + conjuntoPokemons +"\n _____________________________";
    }
public boolean tienePokemonVivo() {
        NodoPokemon actual = conjuntoPokemons.top;

        while (actual != null) {
            if (actual.getPokemon().estaVivo()) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

         public Pokemon elegirPokemonParaBatalla() {
    if (conjuntoPokemons != null && conjuntoPokemons.top != null) {

        if (conjuntoPokemons.top.getPokemon() != null && !conjuntoPokemons.top.getPokemon().estaVivo()) {
           

 
            conjuntoPokemons.desapilar();
             System.out.println("El Pokémon actual ha muerto." + nombre+" envia a: "+conjuntoPokemons.top.getPokemon().getNomPokemon());
        }


        return conjuntoPokemons.top != null ? conjuntoPokemons.top.getPokemon() : null;
    } else {
        System.out.println("No hay Pokémon disponibles para la batalla.");
        return null;
    }
}
   public int elegirAtaqueAleatorio() {

        int opcionAleatoria = (int) (Math.random() * 4); 

        System.out.println("El entrenador " + nombre + " eligió aleatoriamente el ataque " + opcionAleatoria);

        return opcionAleatoria;
    }
}
