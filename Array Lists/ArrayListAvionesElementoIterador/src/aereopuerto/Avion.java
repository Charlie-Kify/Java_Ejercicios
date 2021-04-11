/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

/**
 *
 * @author charlie
 *   * Crea una clase Avion con los siguientes atributos:
        - Modelo
        - Numero de asientos
        - Velocidad maxima
    Dos constructores:
        - Constructor vacio
        - Constructor completo
    Métodos o propiedades:
        - Getter y setter
        - toString() 
        * 
        * 
        * //PARTE DOS
        * Crea una interfaz Activable para la clase avion que nos indique 
        * si está preparado para volar o no.
        * 
        * Tendrá los siguiente smétodos:
        * -isActivado()
        * setActivado()
        * 
        * Añade un atributo a la clase Avion llamado activadoy modifica el
        * método mostrarAviones, para que solo se muestren los que están activos.
 */
class Avion implements Activable{
    //Atributos
    private String modelo;
    private int asientos;
    private double velocidadMax;
    private boolean activado;
    
    //Constructor Vacio
     public Avion() {
        /*this.modelo = "";
        this.asientos = 0;
        this.velocidadMax = 0;*/
        this("",0,0);
    }
     
     /**
      * Constructor Completo de Avion
     * @param modelo
     * @param asientos
     * @param velocidadMax
     * @param activado
     */
     public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.asientos = asientos;
        this.velocidadMax = velocidadMaxima;
        this.activado =  false;
        
        
    }
    
    //Métodos y propiedades
     
    /**
     * Devuelve el modelo del avión.
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Establece el modelo del avión.
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Devuelve lel numero de asientos del avión.
     * @return 
     */
    public int getAsientos() {
        return asientos;
    }
    /**
     * Establece el numero de asientosdel avión.
     * @param asientos
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    /**
     * Devuelve la velocidad del avión.
     * @return 
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }
    /**
     * Establece la velocidad máxima del avión.
     * @param velocidadMax
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    /**
     * Devuelve activación de avión..
     * @return 
     */
    @Override
    public boolean isActivado() {
        return activado;
    }
    
    /**
     * Devuelve las cracteristicas del avión.
     * @return 
     */
     @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", asientos=" + asientos + ", velocidadMax=" + velocidadMax + '}';
    }
    
    /**
     * Establece la activación del avión.
     * @param value
     */
    @Override
    public void setActivado(boolean value) {
        this.activado = value;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (this.modelo != other.modelo) {
            return false;
        }
        return true;
    }
}
