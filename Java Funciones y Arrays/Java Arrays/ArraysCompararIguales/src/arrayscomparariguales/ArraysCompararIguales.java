/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscomparariguales;

import java.util.Arrays;

/**
 *
 * @author charlie
 * 
 * CREA DOS ARREGLOS E INDICA SI SON IGUALES
 */
public class ArraysCompararIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2 = {1,2,3,4,5,6,7,8,9};
        
        int[] array3= {1,2,3,4,5,6,7,8};
        int[] array4 = {1,2,3,4,5,6,7,8,9};
        
        if (Arrays.equals(array1,array2)) {
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos No son iguales");
        }
        
        if (Arrays.equals(array3,array4)) {
            System.out.println("Los arreglos son iguales");
        }else {
            System.out.println("Los arreglos No son iguales");
        }
    }
    
   
   

}
