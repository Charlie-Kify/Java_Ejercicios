/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author charlie
 *
 * Actualiza el proyecto POO de Aereopuerto con lo siguiente: ->Cambia los array
 * por ArrayLists ->Añade a la clase Avión su correspondiente equal ->Modifica
 * el método añadirAvión y agrega otro que s ellame eliminarAvión
 */
public abstract class Aereopuerto implements Comparable<Aereopuerto> {

    /**
     * @param args the command line arguments
     */
    private static int id_autoenumerado = 1;

    //Atributos
    private int id;
    private String nombre;
    private Direccion direccion;
    private int anio_in, capacidad;
    private ArrayList<Avion> aviones;

    // Constructores
    public Aereopuerto() {
        /* this.id = id_autoenumerado++;
        aviones = new Avion[MAX_AVIONES];
        this.num_aviones = 0;*/
        //Se llama al constructor más grande
        this("", "", "", "", 0, 0, 0);

    }

    public Aereopuerto(String nombre, Direccion direccion, int anio_in, int capacidad) {
        /*this.id = id_autoenumerado++;
        this.nombre = nombre;
        this. direccion = direccion;
        this.anio_in = anio_in;
        this.capacidad = capacidad;
        this.aviones = new Avion[MAX_AVIONES];
        this.num_aviones = 0;*/
        this(nombre, direccion.getPais(),
                direccion.getCiudad(),
                direccion.getCalle(),
                direccion.getNum(),
                anio_in,
                capacidad);
    }

    /**
     * Constructor Completo
     *
     * @param nombre
     * @param pais
     * @param ciudad
     * @param calle
     * @param num
     * @param anio_in
     * @param capacidad
     */
    public Aereopuerto(String nombre, String pais, String ciudad, String calle, int num, int anio_in, int capacidad) {
        this.id = id_autoenumerado++;
        this.nombre = nombre;
        this.direccion = new Direccion(pais, ciudad, calle, num);
        this.anio_in = anio_in;
        this.capacidad = capacidad;
        this.aviones = new ArrayList<Avion>();
        
    }

    //Metodos Getter y Setter
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del aeropuerto
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece nomnbre del aeropuerto
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el la dirección del aeropuerto.
     *
     * @return
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece direccion del aeropuerto
     *
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el año de inauguración.
     *
     * @return
     */
    public int getAnio_in() {
        return anio_in;
    }

    /**
     * Establece el año de inauguración
     *
     * @param anio_in
     */
    public void setAnio_in(int anio_in) {
        this.anio_in = anio_in;
    }

    /**
     * Devuelve la capacidad del aeropuerto;
     *
     * @return
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad del aeropuerto
     *
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //UN MÉTODO FINAL ES HEREDADO A LAS CLASES HIJAS, PERO ESTÁS NO PUEDEN 
    //SOBREESCRIBIRLO
    /**
     * Devuelve los años que ha estado en funcionamiento.
     *
     * @return
     */
    public final int aniosAbierto() {
        int anio_actual = Calendar.getInstance().get(Calendar.YEAR);

        return anio_actual - anio_in;
    }

    /**
     * Devuelve el número de aviones que tiene un aeropuerto.
     *
     * @return
     */
   
    /**
     * Añade aviones a un aeropuerto.
     *
     * @Avion
     */
    public void aniadirAviones(Avion a) {
        if (a != null) {
            this.aviones.add(a);
        } else {
            System.out.println("No debe ser nulo.");
        }
    }

    public void eliminarAvion(Avion a) {
        if (a != null) {
            this.aviones.remove(a);
        } else {
            System.out.println("No debe ser nulo.");
        }
    }

    /**
     * Devuelve la descipcion de aviones que tiene un aereopuerto.
     *
     * @return
     */
    public String mostrarAviones() {
        String avionesCadena = "";
        for (Avion a : aviones) {

            if (a.isActivado()) {
                avionesCadena += a.toString() + "\n";
            }

        }
        return avionesCadena;
    }

    /**
     * Devuelve una igualdad entre aeropuertos.
     *
     * @return
     */
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
        final Aereopuerto other = (Aereopuerto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve una comparacion entre la antigüedad de dos aeropuertos.
     *
     * @return
     */
    @Override
    public int compareTo(Aereopuerto o) {

        if (this.aniosAbierto() < o.aniosAbierto()) {
            return 1;
        } else if (this.aniosAbierto() > o.aniosAbierto()) {
            return -1;
        } else {
            return 0;
        }

    }

    //CREANDO METODO ABSTRACTO
    /**
     * Devuelve la descripción completa de un aeropuerto.
     *
     * @return
     */
    public abstract void gananciasTotales(double cantidad);

    @Override
    public String toString() {
        return "Aereopuerto : " + "\n" + "nombre=" + nombre
                + "\n" + "id=" + id + "\n" + "direccion="
                + direccion
                + "\n" + "año de inauguración=" + anio_in + "\n"
                + "capacidad=" + capacidad
                + "\n" + "aviones=" + mostrarAviones()
                +  "\n";
    }

}
