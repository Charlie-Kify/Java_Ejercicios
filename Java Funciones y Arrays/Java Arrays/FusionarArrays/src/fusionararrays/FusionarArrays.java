/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fusionararrays;

/**
 *
 * @author charlie
 * 
 * Fusionar dos arrays creados por ti.
 */
public class FusionarArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = {0,1,2,3,4,5};
        int[] b = {6,7,8,9,10,11};
        
        int[] c = new int[a.length + b.length];
        
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        
        for (int i = a.length, j=0; i < c.length; i++, j++) {
            c[i] = b[j];
        }
        mostrarArray(c);
    }
    
    public static void mostrarArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    
}
