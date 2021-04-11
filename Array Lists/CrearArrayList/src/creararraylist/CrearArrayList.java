/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararraylist;

import java.util.ArrayList;

/**
 *
 * @author charlie
 * 
 * Crear un ArrayList y rellenarlo con una cantidad aleatoria 
 * de números entre el 1 y el 10. Por ejemplo, en una iteración lo puedes 
 * rellenar con 20 elementos , y en otra con 14.
 */
public class CrearArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        int cantidadNumeros = generaNumeroAleatorio(1,20);
        
        for (int i = 0; i < cantidadNumeros; i++) {
            lista.add(generaNumeroAleatorio(1,10));
        }
        
        //Método tradicional para recorrer u arraylist
        /*int elemento;
        for (int i = 0; i < lista.size(); i++) {
            elemento = lista.get(i);
            System.out.println(elemento);
        }*/
        
       // Método for(it): Más recomendado para recordar un arrray list.
        for (Integer i:lista) {
            System.out.println(i);
        }
    }
    
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random()*(maximo -minimo +1 )+ (minimo));
    
    }
    
}
