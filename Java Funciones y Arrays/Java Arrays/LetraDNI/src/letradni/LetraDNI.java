/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letradni;

import java.util.Scanner;

/**
 *
 * @author charlie
 */
public class LetraDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        char[] letrasNIF = {'Z','Y','X','W','V','U','T','S','R','Q',
                            'P','O','N','M','L','K','J','I','H','G',
                            'F','E','D','C','B','A'};
        
        System.out.println("Escribe tu numero DNI");
        int dni = sc.nextInt();
        
        final int DIVISOR = 23;
        int indiceLetra = dni % DIVISOR;
        
        System.out.println(dni+""+letrasNIF[indiceLetra]);
    }
    
}
