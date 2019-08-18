package principal;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Clase Numeros que realiza todas las operaciones con el vector
 * que se le pide al usuario.
 * @author BRAYAN, ISAAC
 */
public class Numeros {  
    
    /*
      Variable de tipo entero que representa el número mayor dentro del arreglo.
    */
    private int mayor;
    
    /*
        Variable de tipo entero que representa el número menor dentro deel arreglo.
    */
    private int menor;
    
    /*
    Variable de tipo entero que sirve de identificador de los números faltantes.
    */
    private int numEx;
    
    
    /**
     * Constructor vacío de la Clase Numeros
     */
    public Numeros (){
        
    }
    
    /**
     * Método vacío que no recibe parámetros para recibir los datos del usuario y guardarlos
     * en un vector de tipo entero
     * @see NumerosFaltantes
     */    
    public void guardarNumeros(){
        int comparar;
        int i,j;
        int valorArray;
        String leer;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los numeros separados por una coma");
        leer = teclado.next();
        String[] numerosp = leer.split(",");
        valorArray = numerosp.length;
        int[] vector = new int[valorArray];
        for(i=0; i<numerosp.length; i++){
            vector[i] = Integer.parseInt(numerosp[i]);
        }
        numerosFaltantes(vector);
    }
    /**
     * Método vacío que recibe el vector y a través de un for ordena los números, y a través de las posiciones
     * determina cuál es el número mayor, el menor y los númreos faltantes en la secuencia ingresada po el usuario.
     * Luego los imprime.
     * @param vector Arreglo de tipo entero que contiene los números ingresados por el usuario.
     */
    private void numerosFaltantes(int[] vector){
        mayor = -9999;
        menor = 9999;        
        numEx=0;
        for(int i=0; i<vector.length; i++){
            if(mayor < vector[i]){
                mayor = vector[i];
            }
            if(menor > vector[i]){
                menor = vector[i];
            }
        }
        System.out.println("____________________________________________________");
        System.out.println("El numero mayor es:" +mayor+"\nEl número menor es: "+menor);
        System.out.println("Los números faltantes son: ");
        for (int j=menor; j<mayor; j++){
            for(int k=0; k<vector.length; k++){
                if(j == vector[k]){
                    numEx++;
                }
            }
            if(numEx==0){
                System.out.println(j);
            }
            numEx=0;
        }
    }
}
