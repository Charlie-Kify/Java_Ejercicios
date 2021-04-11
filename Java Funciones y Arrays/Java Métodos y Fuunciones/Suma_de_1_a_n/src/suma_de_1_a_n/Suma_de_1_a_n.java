/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_de_1_a_n;

/**
 *
 * @author charlie
 */
public class Suma_de_1_a_n {

    /**
     * @param args the command line arguments
     * 
     * CREAR UNA FUNCIÓN QUE RETORNE LA SUMA DEL 1 AL NÚMERO QUE SE 
     * PASE POR PARÁMETRO (INCLUYENYO ESTE NÚMERO).
     * 
     * función devuelve algo
     * método no devuelve nada
     */
    public static void main(String[] args) {
        // AQUÍ SE LLAMA LA FUNCIÓN 
        
        //1º Forma
        int n = 15;
        System.out.println(suma1N(n));
        
        //2ª forma
        int res = suma1N(15);
        System.out.println(res);
       
    }
    
    //AQUÍ SE DECLARA Y DEFINE LA FUNCIÓN
    public static int suma1N(int num){
        
        int suma = 0;
        
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        
        return suma;
    }
}
