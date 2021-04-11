/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniahorcado;

import java.util.Scanner;

/**
 *
 * @author charlie
 * 
 * Vamos a hacer un pequeño juego de Ahorcado
 * Tendremos un pequeño array con palabras creado por ti mismo.
 * Debes mostrar la palabra con guiones e ir pidiend letras.
 * El usuario gan cuando la palabra este cmpleta.
 * i falla 6 veces el usuario pierde
 */
public class MiniAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_FALLOS_MAX = 6;
        final String[] PALABRAS = {
        "chiste",
        "elefante",
        "alberto",
        "coche",
        "llaves",
        "naranja"            
        };
        
        Scanner sc = new Scanner(System.in);
        
        String palabraElegida = PALABRAS[generarNumeroAleatorio(0, PALABRAS.length-1)];
        
        char[] caracteres = palabraElegida.toCharArray();
        boolean[] acertados = new boolean[caracteres.length];
        boolean ganaUsuario = false;
        
        
        int numFallos = 0;
        
        char caracter;
        while (!palabraAcertada(acertados) && numFallos < NUM_FALLOS_MAX ) {
            
            mostrarCaracteres(caracteres, acertados);
            System.out.println("Escribe una letra: ");
            caracter = sc.next().toLowerCase().charAt(0);
            
            if (revelarCaracteres(caracter, caracteres, acertados) > 0) {
                System.out.println("Has acertado!");
            } else {
                numFallos++;
                System.out.println("Has fallado, te quedan " + (NUM_FALLOS_MAX - numFallos) + " fallos");
            }  
        }
        if (palabraAcertada(acertados)) {
            System.out.println("Has Ganado!!");
        }else {
            System.out.println("Has perdido =(");
        }
    }
        
        
        
    
    public static int generarNumeroAleatorio(int max, int min){
        return (int) (Math.random()*(max - min + 1) + (min));
    }
    
    public static void mostrarCaracteres(char[]caracteres, boolean[]acertados){
        
        for (int i = 0; i < caracteres.length; i++) {
            
            if (acertados[i]) {
                System.out.print(caracteres[i]+" ");            
            } else {
                System.out.print("_ ");
            }
            
        }
        System.out.println("");
    }
    
    public static boolean palabraAcertada(boolean[] acertados){
        for (int i = 0; i < acertados.length; i++) {
            if (!acertados[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static int revelarCaracteres(char caracter, char[]caracteres, boolean[]acertados){
        int acertadas = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == caracter){
                acertados[i] = true;
                acertadas ++;
            }
        }
        return acertadas;
    }
}
