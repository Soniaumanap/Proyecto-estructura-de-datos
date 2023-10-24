/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
public abstract class Pokemon {

    protected String nomPokemon;
    protected int vida, ataque, defensa, ataqueEsp, defensaEsp,tipo;

    public String getNomPokemon() {
        return nomPokemon;
    }

    public void setNomPokemon(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEsp() {
        return ataqueEsp;
    }

    public void setAtaqueEsp(int ataqueEsp) {
        this.ataqueEsp = ataqueEsp;
    }

    public int getDefensaEsp() {
        return defensaEsp;
    }

    public void setDefensaEsp(int defensaEsp) {
        this.defensaEsp = defensaEsp;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}


