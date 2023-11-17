
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brand
 */
    public class Charizard extends Pokemon implements IFuego{
    public Charizard() {
        nomPokemon="Charizard";
        vida=115;
        ataque=50;
        defensa=35;
        ataqueEsp=70;
        defensaEsp=60;
    }
       
        @Override
    public int ataqueLanzallamas(Pokemon defensor) {
        int danioBase = 85;
        int danioTotal = (danioBase + getAtaqueEsp()) - defensor.defensaEsp;
        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);
        System.out.println(getNomPokemon() + " usa Lanzallamas y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataqueAnilloIgneo(Pokemon defensor) {

        int danioBase = 85;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensaEsp;
        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);
        System.out.println(getNomPokemon() + " usa Anillo Igneo y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    // Ataques físicos de tipo Fuego
    @Override
    public int ataqueColmilloIgneo(Pokemon defensor) {
        int danioBase = 85;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;
        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);
        System.out.println(getNomPokemon() + " usa Colmillo Igneo y causa " + danioTotal + " de daño.");
        return danioTotal;
    }

    @Override
    public int ataquePuñoFuego(Pokemon defensor) {
         int danioBase = 85;
        int danioTotal = (danioBase + getAtaque()) - defensor.defensa;
        int multiplicadorTipo = (int) calcularMultiplicador(defensor);
        danioTotal = (int) (danioTotal * multiplicadorTipo);
        System.out.println(getNomPokemon() + " usa Puño Fuego y causa " + danioTotal + " de daño.");
        return danioTotal;
    }


    @Override
    public String toString() {
        return "Charizard" ;
    }
    
    @Override
    public boolean estaVivo() {
    return vida > 0;
}

    @Override
    public int elegirAtaque(Pokemon defensor) {
    String[] opciones = {"Lanzallamas", "Anillo Ígneo", "Colmillo Ígneo", "Puño Fuego"};
    
   
    String eleccion = (String) JOptionPane.showInputDialog(null, "Elige un ataque", "Elegir Ataque",
            JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

   
    switch (eleccion) {
        case "Lanzallamas":
            System.out.println("Usuario eligió Lanzallamas");
            return ataqueLanzallamas(defensor);
        case "Anillo Ígneo":
            System.out.println("Usuario eligió Anillo Ígneo");
            return ataqueAnilloIgneo(defensor);
        case "Colmillo Ígneo":
            System.out.println("Usuario eligió Colmillo Ígneo");
            return ataqueColmilloIgneo(defensor);
        case "Puño Fuego":
            System.out.println("Usuario eligió Puño Fuego");
            return ataquePuñoFuego(defensor);
        default:
            System.out.println("Usuario eligió una opción no válida");
            return 0;
    }
}
    @Override
    public void recibirDanio(int danio) {
        super.recibirDanio(danio);
}
    @Override
    public double calcularMultiplicador(Pokemon defensor) {
        if (defensor instanceof INormal) {
            return 1.5;
        } else if (defensor instanceof IAgua) {
            return 0.5; 
        } else {
            return 1.0; 
        }
    }
    
    @Override
        public int elegirAtaqueAleatorio(Pokemon defensor) {

        
        int eleccion = (int) (Math.random() * 4);

        switch (eleccion) {
            case 0:
                return ataqueLanzallamas(defensor);
            case 1:
                return ataqueAnilloIgneo(defensor);
            case 2:

                return ataqueColmilloIgneo(defensor);
            case 3:

                return ataquePuñoFuego(defensor);
            
            default:
                return 0;
        }
    }
}


