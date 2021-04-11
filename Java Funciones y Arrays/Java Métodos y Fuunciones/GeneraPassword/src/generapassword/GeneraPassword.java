/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generapassword;

/**
 *
 * @author charlie
 * 
 * Crea una función que genere un password aleatoriamente con letras mayúsculas
 * minuscuas y numeros.
 * Paarl por paraetro la longitud el password.
 * 
 */
public class GeneraPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(generaPassword(8));
        System.out.println(generaPassword(16));
    }
    
    public static int genraNumeroAleatorio(int min, int max){
        return (int) (Math.random() * (max-min+1) + min);
    }
    
    public static char generaMayusculaAleatorio(){
        return (char) genraNumeroAleatorio(65, 90);
    }
    
    public static char generaMinusculalaAleatorio(){
        return (char) genraNumeroAleatorio(97, 122);
    }
    
    public static String generaPassword(int longitud){
        
        String password =  "";
        
        int eleccion;
        for (int i = 0; i < longitud; i++) {
           
            eleccion =  genraNumeroAleatorio(1, 3);
            
            switch (eleccion){
                case 1: //numero
                    password += genraNumeroAleatorio(0, 9);
                    break;
                case 2: // mayuscula
                    password += generaMayusculaAleatorio();
                    break;
                case 3: // minuscula
                    password += generaMinusculalaAleatorio();
                    break;
            }
        }
        return password;
    }
}


