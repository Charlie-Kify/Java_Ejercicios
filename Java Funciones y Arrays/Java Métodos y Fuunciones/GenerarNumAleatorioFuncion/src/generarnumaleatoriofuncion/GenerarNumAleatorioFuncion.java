/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarnumaleatoriofuncion;

/**
 *
 * @author charlie
 */
public class GenerarNumAleatorioFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        //SE LLAMA A LA FUNCIÓN
        for (int i = 0; i < 10; i++) {
            System.out.println(generaNumeroAleatorio(1,100));
        }
    }
    
    //SE DECLARA LA FUNCION
    public static int generaNumeroAleatorio(int minimo, int maximo) {
        return (int) (Math.random()*(maximo -minimo +1 )+ (minimo));
    
    }
}
