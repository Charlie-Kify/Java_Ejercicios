/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarnumerofuncion;

import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class ValidarNumeroFuncion {

    /**
     * @param args the command line arguments
     * 
     * CREA UNA FUNCION QUE VALIDE UN NUMERO ENTRE DOS NUMEROS.
     * NECESITAS DOS PARÁMETROS NUMÉRICOS
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(validaNumero(0, 10));
        
        
    }
    
    
    public static int validaNumero(int min, int max){
        
        Scanner sc = new Scanner(System.in);
        
        if (min > max) {
            
            int aux = min;
            min = max;
            max = aux;
        }
        
        int num;
        
        do {
            System.out.println("Esccribe un numero");
            num = sc.nextInt();
            
            if (!(min >= 0 && num <= max)) {
                
                System.out.println("Debes escribir un numero entre " + min + " y" + max );
            }
        } while (!(min >= 0 && num <= max));
        
        return num;
      
        
             
    }
    
}
