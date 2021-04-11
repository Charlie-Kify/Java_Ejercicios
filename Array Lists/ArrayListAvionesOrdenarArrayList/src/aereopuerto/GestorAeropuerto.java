/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author charlie
 * 
 * Crea un ArrayList y ordenálos de menor a mayor.
 * Un avión es mayor a otro cuando su velocidad es mayor.
 * 
 * 
 * 
 */
public class GestorAeropuerto {

    public static void main(String[] args) {

        Avion a1 = new Avion("Boing 123", 100, 200);
        Avion a2 = new Avion("Boing 456", 200, 400);
        Avion a3 = new Avion("Boing 789", 300, 600);

        ArrayList<Avion> aviones = new ArrayList<>();

        aviones.add(a1);
        aviones.add(a2);
        aviones.add(a3);
       
        Collections.sort(aviones);
        
        for (Avion a : aviones) {
            System.out.println(a);
        }
        
       

        
    }

}
