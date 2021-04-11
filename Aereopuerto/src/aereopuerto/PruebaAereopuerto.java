/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

/**
 *
 * @author charlie
 */
public class PruebaAereopuerto {
    
    public static void main(String[] args) {
        
        Direccion d = new Direccion("España", "Madrid,", "Rosas", 8);
        
        //Aereopuerto a9 = new Aereopuerto("Aereopuerto Test",d, 1970,1000);
        AereopuertoPrivado a7 = new AereopuertoPrivado(5, "Quijote Airport", d,1970, 10000);
        AereopuertoPublico a8 = new AereopuertoPublico(100000, 10, "Adolfo Suarez", "Mexico", "Toluca","Boulevard Matías Gómez",45,2006,27000);
        
        //a7.gananciasTotales(1000000);
        //a8.gananciasTotales(1000000);
        
        Avion av1 = new Avion("Boing 234", 400,700);
        Avion av2 = new Avion("Boing 233", 300,700);
        Avion av3 = new Avion("Boing 457", 400,600);
        Avion av4 = new Avion("Boing 457", 400,600);
        
        a7.aniadirAviones(av1);
        a7.aniadirAviones(av2);
        
        a8.aniadirAviones(av3);
        a8.aniadirAviones(av4);
        
        av1.setActivado(true);
        av2.setActivado(true);
        av3.setActivado(true);
        
        System.out.println(a7);
        System.out.println(a8);
       
        
        /*Aereopuerto a1 = new Aereopuerto("Benito Juarez", "Mexico",
                                           "CDMX", "Av. Capitán Carlos León ",
                                           0, 1952,460245); */
        
        //System.out.println(a.toString());
        //System.out.println(a.aniosAbierto());
        
        /*Aereopuerto a2 = new Aereopuerto("Adolfo Suarez", "Mexico",
                                           "Madrid", "Calle de Fuego ",
                                           1, 1970,250000); */
        
        //System.out.println(a2.toString());
        //System.out.println(a2.aniosAbierto());
        
        //System.out.println("----------------"+ "\n");
        
        
        
        
        //System.out.println(a.getNum_aviones());
        //System.out.println(a);
        
        /*Aereopuerto a3 = new Aereopuerto("No especificado", "Mexico",
                                           "Toluca", "No especificado",
                                           99, 2000,60000); 
        Aereopuerto a4 = new Aereopuerto("No especificado", "No especificado",
                                           "No especificado", "No especificado ",
                                           0, 2000,0); 
        Aereopuerto a5 = new Aereopuerto("Santa Teresa", "Mexico",
                                           "No especificado", "No especificado ",
                                           234, 2020,1250000); */
        
        /*System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);*/
        
        
        
        /*if (a1.equals(a3)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        switch(a1.compareTo(a3)){
            
            case 1:
                System.out.println("a1 > a3");
                break;
            case 0:
                System.out.println("son iguales");
                break;
            case -1:
                System.out.println("a1 < a3");
                break;
       
        
        }         */
        
       
        
    }
}
