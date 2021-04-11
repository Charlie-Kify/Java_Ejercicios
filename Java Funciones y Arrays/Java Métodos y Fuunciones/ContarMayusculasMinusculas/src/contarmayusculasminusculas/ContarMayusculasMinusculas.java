/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarmayusculasminusculas;

/**
 *
 * @author charlie
 * 
 * CREA UNA FUNCIÓN QUE DADOS DOS PARÁMETROS, SIENDO EL PRIMERO UN STRING
 * Y EL SEGUNDO UN BOOLEAN, CUENTE LAS LETRAS MAYUSCULAS O MINUSCULAS, SEGUN 
 * E VALOR DEL SEGUNDO PARÁMETRO.
 */
public class ContarMayusculasMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // No contabiliza la ñ
        System.out.println(cuentaLetras("Hola Mundo", true));
    }
    
    public static int cuentaLetras(String frase,boolean mayuscula){
        
        int min, max, contador = 0;
        
        if (mayuscula) {
            min = 65;
            max = 90;
        }else {
            min = 97;
            max = 122;
        }
        
        char caracter;
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            
            if (caracter >= min && caracter <= max) {
                contador++;
            }
        }
        return contador;
    }
    
}
