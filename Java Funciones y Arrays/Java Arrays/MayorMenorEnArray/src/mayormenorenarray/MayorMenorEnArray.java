/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenorenarray;

import java.util.Arrays;

/**
 *
 * @author charlie
 * 
 * MOSTRASR EL NUMERO MAYOR Y EL NUMERO MENOR D EUN ARREGLO DE NUMEROS CREADO POR TI
 */
public class MayorMenorEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int[] numeros = {15,78,23,12,4,6,2,139,937,416,34,52,367,749,9264,74,3,5,13};
        
        //Llamando a la primera función (método largo)
        System.out.println("Versión 1");
        mayorMenorArray(numeros);
        
        //Llamando a la primera función (método largo)
        System.out.println("Versión 2");
        mayorMenorArrayV2(numeros);
        
    }
    
    //VERSIÓN 1
     public static void mayorMenorArray(int[] array){
         int mayor = array[0];
         int menor = array[0];
         
         for (int i = 1; i < array.length; i++) {
             
             if(array[i] > mayor){
                 mayor = array[i];              
             }
             
              if(array[i] < menor){
                 menor = array[i];
             
         }
     }
         System.out.println("El Mayor es: " + mayor );
         System.out.println("El Menor es: " + menor );
    }
     
    //VERSIÓN 2
    public static void mayorMenorArrayV2(int[] array){
        Arrays.sort(array);
        
        int menor = array[0];
        int mayor = array[array.length-1];
        
        System.out.println("El Mayor es: " + mayor );
        System.out.println("El Menor es: " + menor );
    }
}
