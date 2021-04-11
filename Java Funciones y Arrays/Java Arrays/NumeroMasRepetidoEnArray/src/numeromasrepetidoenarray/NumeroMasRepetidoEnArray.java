/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromasrepetidoenarray;

/**
 *
 * @author charlie
 * Dado un array de numeros, indica cual es el elemento más repetido,
 * en caso de empate mostrar el último más repetido.
 */
public class NumeroMasRepetidoEnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] a = {1,5,4,3,1,2,4,3,3,6,7,5,5,3};
        
        int contador = 0;
        int mayor = 0;
        int mayorRepeticiones = 0;
        
        int numeroBuscado; //Primier loop
        int numeroActual; //Loop anidado
        
        for (int i = 0; i < a.length; i++) {
            numeroBuscado = a[i];
            contador = 0;
            for (int j = 0; j < a.length; j++) {
                numeroActual = a[j];
                if (numeroBuscado == numeroActual ) {
                    contador ++;
                }
            }
            
            if (contador >= mayorRepeticiones ) {
                mayor = numeroBuscado;  
                mayorRepeticiones = contador;
            }
        }
        System.out.println("El numero más repetido es: " + mayor + " con " + mayorRepeticiones + " repeticiones" );
    }
    
}
