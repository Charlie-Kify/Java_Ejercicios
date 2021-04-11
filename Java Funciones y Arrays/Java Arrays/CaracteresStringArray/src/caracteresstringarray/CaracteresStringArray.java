/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresstringarray;

import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class CaracteresStringArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PIDE UNA FRASE POR CONSOLAY GUARDA EN UN ARRAY LOS CARACTERES
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe una frase:");
        String frase = sc.next();
        
        //1RA FORMA
        /*char[] caracteres = new char[frase.length()];
        char caracter;
        
        for (int i = 0; i < caracteres.length; i++) {
            
            caracter = frase.charAt(i);
            caracteres[i] = caracter;
            
        }
        
        mostrarArray(caracteres);
       */
        
       //2NDA FORMA
       char[] cracteres = frase.toCharArray();
       
       mostrarArray(cracteres);
        
    }
    
     public static void mostrarArray(char[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
     
}
