package aereopuerto;


import aereopuerto.Aereopuerto;
import aereopuerto.Direccion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author charlie
 */
public class AereopuertoPrivado extends Aereopuerto {
    
    private int numSocios;

    public AereopuertoPrivado(int numSocios) {
        super();
    }

    public AereopuertoPrivado(int numSocios, String nombre, Direccion direccion, int anio_in, int capacidad) {
        super(nombre, direccion, anio_in, capacidad);
        this.numSocios = numSocios;
    }
    
    /**
     * Constructor Completo de Aereopuerto Privado
     * @param numSocios
     * @param nombre
     * @param pais 
     * @param ciudad
     * @param calle
     * @param num
     * @param anio_in
     * @param capacidad
     */
    public AereopuertoPrivado(int numSocios, String nombre, String pais, String ciudad, String calle, int num, int anio_in, int capacidad) {
        super(nombre, pais, ciudad, calle, num, anio_in, capacidad);
        this.numSocios = numSocios;
    }
    /**
     * Devuelve el numero de socios del aeropueto;
     * @return 
     */
    public int getNumSocios() {
        return numSocios;
    }
    /**
     * establece el numero de socios.
     * @param numSocios 
     */
    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }
    
    //MÉTODO ABSTRACTO: Es forzoso desde la clase padre
    /**
     * Muestra las ganancias totales del aeropuerto privado.
     * @param cantidad 
     */
    @Override
    public void gananciasTotales(double cantidad) {
        double cantidadSocios = cantidad / this.numSocios;
        System.out.println("La cantidad por cada socio es: " + cantidadSocios);
    }
    
    /**
     * Muestra todas las aracteristicas de un aeropuerto privado
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Aereopuerto Privado" + "\n" + "numSocios=" + numSocios;
    }

    
    
    
    
}
