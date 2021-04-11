/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearunarray;

import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class CrearUnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[3];
        
        int numero;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserta un numero en la posicion:" + i);
            numero = sc.nextInt();
            numeros[i] =  numero;
        }
        
        System.out.println("---Mostrar Array---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
