/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardadigitosenarrray;

import java.util.Scanner;

/**
 *
 * @author charlie
 * 
 * CREA UNA FUNCIÓN QUE DADO UN NUMERO NATURAL, GUARDE LOS DIGITOS EN UN ARRAY
 */
public class GuardaDigitosEnArrray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = validaNumero(0, Integer.MAX_VALUE);
        
        int[] numeros = digitosNumeros(num);
        
        mostrarArray(numeros);
        
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
    
    public static int[] digitosNumeros(int num){
        int numCifras = 0;
        
        for (int i = num; i > 0; i/=10) {
            numCifras ++;
        }
        
        int[] digitos = new int[numCifras];
        
        //de derecha a izquierda
       /* for (int i = num, j=0; i > 0; i/=10, j++) {
            digitos[j] = i % 10;
        } */
        
        //de izquierda a dercha
        for (int i = num, j=numCifras-1; i > 0; i/=10, j--) {
            digitos[j] = i % 10;
        }
        
        return digitos;
    }
    
    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
                  
        }
    }
}