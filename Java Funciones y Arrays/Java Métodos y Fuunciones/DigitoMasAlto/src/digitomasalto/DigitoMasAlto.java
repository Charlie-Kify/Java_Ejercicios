/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitomasalto;

/**
 *
 * @author charlie
 */
public class DigitoMasAlto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(digitoMasAlto(40323));
    }
    
    public static int digitoMasAlto(int num){
        
        final int DIVISOR =10;
        int mayor = 0;
        
        for (int i = num; i > 0; i/=DIVISOR) {
            if ((i % DIVISOR ) > mayor) {
                mayor = i% DIVISOR;
            }
        }
        return mayor;
    }
    
}
