/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rellenararrayaleatorio;

/**
 *
 * @author charlie
 * 
 * CREAR U ARRAY DE 1O POSICIONES Y RELLENARLOCON NUMEROS ALEATORIOS.
 * MUETSRALOS AL FINAL.
 * CREA UNA FUNCION PARA RELLENARLO Y OTRA PARA MOSTRAR.
 */
public class RellenarArrayAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int min =5;
        int max =10;
        int[] numerosAleatorios = new int[10];
        rellenarArrayAleatorio(numerosAleatorios, min, max);
        mostrarArray(numerosAleatorios);
    }
    
    public static int generarNumeroAleatorio(int max, int min){
        return (int) (Math.random()*(max - min + 1) + (min));
    }
    
    public static void rellenarArrayAleatorio(int[] array, int min, int max){
    
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(min, max);
        }
    }
    
    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
