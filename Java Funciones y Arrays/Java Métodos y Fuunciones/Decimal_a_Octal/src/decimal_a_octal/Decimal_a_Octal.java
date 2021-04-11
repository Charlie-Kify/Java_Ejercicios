/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal_a_octal;

/**
 *
 * @author charlie
 */
public class Decimal_a_Octal {

    /**
     * @param args the command line arguments
     * 
     * CREAR UNA FUNCIÓN QUÉ DANDOLE UN NÚMEO DECIMAL LO PASE A SISTEMA OCTAL
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(decimalOctal(15));
    }
    
    public static int decimalOctal(int decimal){
        int octal = 0;
        int digito;
        
        final int DIVISOR = 8;
        
        for (int i = decimal, j= 0; i > 0; i/= DIVISOR, j++) {
            digito = i % DIVISOR;
            
            octal += digito * Math.pow(10, j);
        }
        
        return octal;
    }
    
}
