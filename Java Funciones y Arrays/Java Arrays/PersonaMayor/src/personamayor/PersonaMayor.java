/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamayor;

/**
 *
 * @author charlie
 */
public class PersonaMayor {

    /**
     * @param args the command line arguments
     * 
     * Teniendo un arreglo String de nombres de personas, y el otro de sus edades
     * Mostrar a la persona de mayor edad
     */
    public static void main(String[] args) {
        
        String[] nombres = {"Fernando", "Jaime", "Alberto", "Pepito"};
        int[] edades = {28, 51, 20, 40};
        
        int mayor = edades[0];
        int posicionMayor = 0;
        
        for (int i = 1; i < edades.length; i++) {
            if (edades[i] > mayor ) {
                mayor = edades[i];
                posicionMayor =i;
                
            }
        }
        System.out.println("a persona mayor es: " + nombres[posicionMayor] + " con " + mayor);
    }
    
}
