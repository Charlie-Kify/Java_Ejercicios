/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author charlie
 *  * Crea una clase Avion con los siguientes atributos:
        - Modelo
        - Numero de asientos
        - Velocidad maxima
    Dos constructores:
        - Constructor vacio
        - Constructor completo
    Métodos o propiedades:
        - Getter y setter
        - toString() 
 */
public class Avion {

    /**
     * @param args the command line arguments
     */
    //Atributos
    private String modelo;
    private int asientos;
    private double velocidadMax;
    
    //Constructor Vacio
     public Avion() {
        this.modelo = "";
        this.asientos = 0;
        this.velocidadMax = 0;
    }
     
     public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.asientos = asientos;
        this.velocidadMax = velocidadMaxima;
    }
    
    //Métodos y propiedades

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", asientos=" + asientos + ", velocidadMax=" + velocidadMax + '}';
    }

    void setModelo(String boing_77, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
