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
public class AereopuertoPublico extends Aereopuerto {
    
    //Atributos ce la clase
    private double financiacion;
    private int numTrabajadoresDiscapacitados;

    public AereopuertoPublico(double financiacion, int numTrabajadoresDiscapacitados) {
        super();
    
    }

    public AereopuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, Direccion direccion, int anio_in, int capacidad) {
        super(nombre, direccion, anio_in, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }
    
    /**
     * Constructor Completo de Aereopuerto Privado
     * @param financiacion
     * @param numTrabajadoresDiscapacitados
     * @param nombre
     * @param pais 
     * @param ciudad
     * @param calle
     * @param num
     * @param anio_in
     * @param capacidad
     */
    public AereopuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, String pais, String ciudad, String calle, int num, int anio_in, int capacidad) {
        super(nombre, pais, ciudad, calle, num, anio_in, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    AereopuertoPublico(int i, int i0, String adolfo_Suarez) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Devuelve el monto de financiación
     * @return 
     */
    public double getFinanciacion() {
        return financiacion;
    }
    /**
     * Devuelve numero d emepleados discapacitados.
     * @return 
     */
    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }
    /**
     * Establece el monto de financiación
     * @param financiacion 
     */
    public void setFinanciacion(double financiacion) {
        this.financiacion = financiacion;
    }
    /**
     * Establece el numero de empleados discapacitado.
     * @param numTrabajadoresDiscapacitados 
     */
    public void setNumTrabajadoresDiscapacitados(int numTrabajadoresDiscapacitados) {
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }
    
    //MÉTODO ABSTRACTO: Es forzoso desde la clase padre
    /**
     * Muestra las ganancias totales del aeropuerto
     * @param cantidad
     */
    @Override
    public void gananciasTotales(double cantidad) {
        
        double ganancias = cantidad + this.financiacion + (this.numTrabajadoresDiscapacitados * 100);
        
        System.out.println("La ganancia ha sido de: " + ganancias);
    }
    
     /**
     * Muestra todas las aracteristicas de un aeropuerto publico
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Aereopuerto Publico"+ "\n"+ "financiación" + financiacion + "\n" +"numTrabajadoresDiscapacitados=" + numTrabajadoresDiscapacitados + "\n";
    }

    
    
    
    
}
