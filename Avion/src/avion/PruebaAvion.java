/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author charlie
 */
public class PruebaAvion {
    public static void main(String[] args) {
        
        Avion a1 = new Avion();
        Avion a2 = new Avion("Boing 347", 300, 400);
        
        System.out.println(a1.getModelo());
        
        a1.setModelo("Boing 77");
        a1.setAsientos(500);
        
        System.out.println(a1.getModelo());
        System.out.println(a2.toString());
        
             
    }
    
}
