/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestradigitos;

/**
 *
 * @author charlie
 * 
 * CREA UN METODO QUE DADO UN NUMERO MUESTRE SUS DIGITOS
 */
public class MestraDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarDigitos(123);
    }
    
    public static void mostrarDigitos(int numero){
        final int DIVISOR = 10;
        for (int i = numero; i > 0; i /= DIVISOR) {
            //System.out.println(i % DIVISOR);
            System.out.println(i % DIVISOR + " ");
        }
    }
    
}
