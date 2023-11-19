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
    protected int vida, ataque, defensa, ataqueEsp, defensaEsp,tipo,vidaMaxima;
        public void restaurarVida() {
        // Restaurar la vida del Pokémon a su valor máximo
        vida = vidaMaxima;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

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
    public abstract int elegirAtaque(Pokemon defensor);
    public abstract int elegirAtaqueAleatorio(Pokemon defensor);
    
    public boolean estaVivo() {
        boolean vivo=false;
        if(vida > 0){
            vivo=true;
        }
    return vivo ;
}
 public void recibirDanio(int danio) {
        int nuevaVida = this.vida - danio;

        if (nuevaVida < 0) {
            nuevaVida = 0;
        }

        this.vida = nuevaVida;

        System.out.println(this.nomPokemon + " ha recibido " + danio + " de daño. Vida restante: " + this.vida);
        
        if (this.vida == 0) {
            System.out.println(this.nomPokemon + " ha sido derrotado.");
        }
    }
  public abstract void calcularMultiplicador(Pokemon defensor);
}


