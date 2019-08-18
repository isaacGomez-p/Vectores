
import principal.Numeros;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase Principal donde se encuentra la clase que inicia el programa
 * @author BRAYAN, ISAAC
 */
public class Principal {
    
    public static void main (String... a){
        Principal princip = new Principal();
        
    }
    
    /**
     * Constructor de la clase que llama a la clase Numeros
     */
    
    public Principal(){
        Numeros numeros = new Numeros();
        numeros.guardarNumeros();
    }
}
