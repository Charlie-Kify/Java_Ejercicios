/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

import java.util.ArrayList;

/**
 *
 * @author charlie
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

        Avion a4 = new Avion("Boing 789", 300, 600);

        if (aviones.contains(a4)) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
        }
    }

}
