/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadearray;

/**
 *
 * @author charlie
 * 
 * CREAR UN ARREGLO DE NUMEROS (DADOS PORU NO MISMO), E INDICAR CUAL ES
 * LA SUMA Y LA MEDIA DE ESE ARRAY
 */
public class SumaDeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {6,9,2,5,7,9,2,3,4,1,7,9,3,6,3,8,2,9};
        
        int suma = 0;
        double media;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros [i];
            
        }
        
        System.out.println("La suma es: " + suma);
        media = (double)suma / numeros.length;
            System.out.println("La media es: " + media);
    }
    
}
