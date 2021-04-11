/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirpalabrapalindromo;

/**
 *
 * @author charlie
 * 
 * CREAR UN FUNCION QUE DADA UNA FRASE O PALABRA POR PARÁMETRO, 
 * EVALUE SI ES O NO UN PALINDROMO.
 */
public class InvertirPalabraPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (esPalindromo("Dabale arroz a la zorra el abad")) {
            System.out.println("¡ES PALINDROMO!");
        } else {
            System.out.println("No es palindromo");
        
        }
        
    }
    
    public static String invierteFrase(String frase){
        String invertida = "";
        char caracter;
        
        for(int i = frase.length() - 1; i >= 0; i--){
            caracter = frase.charAt(i);
            invertida += caracter;
        }
        
        return invertida;
    }
   

   

public static boolean esPalindromo(String frase){
        
        /*
        El método toLowerCase() convierte a minúsculas todos los caracteres
        El método replaceAll(" ", "") elimina los espacios del String.
        */
        frase = frase.toLowerCase().replaceAll(" ", "");
       
        String invertida = invierteFrase(frase);
 
        return frase.equals(invertida);
    }
    
}
