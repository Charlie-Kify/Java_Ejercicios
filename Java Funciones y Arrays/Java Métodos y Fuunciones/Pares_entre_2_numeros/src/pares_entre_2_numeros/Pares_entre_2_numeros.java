/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares_entre_2_numeros;

/**
 *
 * @author charlie
 */
public class Pares_entre_2_numeros {

    /**
     * @param args the command line arguments
     * 
     * CREAR UNA FUNCIÓN EN LA QUE PASADOS DOS NÚMEROS POR PARÁMETRO
     * MUESTREN TODOS LOS PARESENTRE ESOS DOS NÚMEROS.
     * 
     * 
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        paresEntre(10,1);
        paresEntre(1,10);
    }
    
    //Cuando la función no devueve nada, solo muestra, se usa void.
    public static void paresEntre(int inicio, int fin){
        //Controlar inicio
        if (inicio > fin) {
            int auxiliar = inicio;
            inicio = fin;
            fin = auxiliar;
        }
        
        for (int i = inicio = 1; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
    }
}
