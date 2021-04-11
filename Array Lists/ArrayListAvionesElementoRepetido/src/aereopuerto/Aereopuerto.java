/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

import java.util.Calendar;

/**
 *
 * @author charlie
 * 
 * Crea una clase aereopuerto con los siguientes atributos:
 * -Nombre
 * -Pais
 * -Calle
 * -Numero
 * -Ciudad
 * -Año Inauguracion
 * Capacidad
 * 
 * Dos constructores:
 * -vacio
 * -completo
 * 
 * Métodos y propiedades
 * -Getter y setter
 * -aniosAbierto(): devuelve el numero de años que ha estado abierto
 * -toString()
 * 
 *  //SEGUNDa PARTE:
 * Asoscia el aereopuerto con el avion mediante una asociacion.
 * Un aereopuerto tiene uno o varios aviones
 * Añadiremos tambien una nueva funcion.
 * -añadirAvion(Avion a) 
 * Te recomiendo crear un atibuto más llamado num de aviones.
 * 
 * // TERCERA PARTE
 * 
 * Añade al aereopuerto un atributo estático llamado id_autoenumerado, 
 * cada vez que se añada un objeto, aumentaremos en 1 ese id.
 * 
 * 
 * //CUARTA PARTES
 * Añade las funcionesequals y compareToen aereopuerto
 * dos aereopuertos son iguales cuando el id es el mismo,
 * Un aereopuerto es mayor que otrocuanto más actual es.
 * 
 * //QUINTA PARTE
 * Mejora en los constructores usando this()
 * Hacer esto en las clases Aereopuerto, Dvion y Direccion
 * 
 * // SE CREAN CLASES HIJAS AereopuertoPrivado y AereopuertoPublico
 * 
 * //SEXTA PARTE LA CALSE AEREOPUERTO SE DEJA COM CLASE ABSTRACTA , ES DECIR, 
 * UNA CLASE QUE SOLO PUEDE SER UTILIZADA POR LAS CLASES HIJAS, PERO QUE NO
 * SE PUEDEN CREAR INSTANCIAS DE OBJETOS A PARTIR DE ESTA CLASE SOLITA. 
 * EN OTRAS PALABRAS QUEDARÁ COMO PLANTILLA BASE , PERO SOLO S EPODRAN CREAR O 
 * AEREOPUERTOS PUBLICOS O AEREOPUERTOS PRIVADOS.
 * 
 * Al hacer esto, se deberán de comentar las lineas de código en donde se
 * han creado aereopuertos solo con esta clase en Prueba Aereopuerto.
 * 
 * Haremos la clase aereopuerto Abstracta
 * Crearemos un método abstracto llamado gananciasTotales(cantidad ganada),
 * Según la clase, hará una acción o la otra,
 * 
 * -AereopuertoPublico :se le suma la financiación y una bonificacion 
 * por cada trabajador discapacitado.Muestra el total ganado.
 * 
 * -AereopuertoPrivado: se divide la ganancia entre e numero de socios.
 * Muetsra lo que gana cada socio.
 */

public abstract class Aereopuerto implements Comparable<Aereopuerto> {

    /**
     * @param args the command line arguments
     */
   
    private static int id_autoenumerado = 1;           
    private final int MAX_AVIONES = 20;
    
    
    //Atributos
    private int id;
    private String nombre;
    private Direccion direccion;
    private int anio_in, capacidad;
    private Avion[] aviones;
    private int num_aviones;

    // Constructores
    
    public Aereopuerto() {
       /* this.id = id_autoenumerado++;
        aviones = new Avion[MAX_AVIONES];
        this.num_aviones = 0;*/
       //Se llama al constructor más grande
       this("","","","",0,0,0);
        
    }
    
     public Aereopuerto(String nombre, Direccion direccion, int anio_in, int capacidad){
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
        this. direccion = new Direccion(pais, ciudad, calle, num);
        this.anio_in = anio_in;
        this.capacidad = capacidad;
        this.aviones = new Avion[MAX_AVIONES];
        this.num_aviones = 0;
    }

   
    
    //Metodos Getter y Setter

    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del aeropuerto
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece nomnbre del aeropuerto
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el la dirección del aeropuerto.
     * @return 
     */
    public Direccion getDireccion() {
        return direccion;
    }
    /**
     * Establece direccion del aeropuerto
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    /**
     * Devuelve el año de inauguración.
     * @return
     */
    public int getAnio_in() {
        return anio_in;
    }
    /**
     * Establece el año de inauguración
     * @param anio_in
     */
    public void setAnio_in(int anio_in) {
        this.anio_in = anio_in;
    }
    /**
     * Devuelve la capacidad del aeropuerto;
     * @return 
     */
    public int getCapacidad() {
        return capacidad;
    }
    /**
     * Establece la capacidad del aeropuerto
     * @param capacidad
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    //UN MÉTODO FINAL ES HEREDADO A LAS CLASES HIJAS, PERO ESTÁS NO PUEDEN 
    //SOBREESCRIBIRLO
    /**
     * Devuelve los años que ha estado en funcionamiento.
     * @return 
     */
    public final int aniosAbierto() {
        int anio_actual = Calendar.getInstance().get(Calendar.YEAR);
        
        return anio_actual - anio_in;
    }
    
    /**
     * Devuelve el número de aviones que tiene un aeropuerto.
     * @return 
     */
    public int getNum_aviones() {
        return num_aviones;
    }
    
    /**
     * Añade aviones a un aeropuerto.
     * @Avion
     */
    public void aniadirAviones(Avion a){
        if (num_aviones < MAX_AVIONES) {
            this.aviones[num_aviones] = a;
            num_aviones++;
        }else{
            System.out.println("No puedes añadir más aviones.");
        }
    }
    /**
     * Devuelve la descipcion de aviones que tiene un aereopuerto.
     * @return 
     */
    public String mostrarAviones(){
        String avionesCadena = "";
        for (int i = 0; i < num_aviones; i++) {
            
            if (this.aviones[i].isActivado()) {
                avionesCadena += this.aviones[i].toString() + "\n";
            }
            
            
        }
        return avionesCadena;
    }
    
    /**
     * Devuelve una igualdad entre aeropuertos.
     * @return 
     */
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
        final Aereopuerto other = (Aereopuerto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    /**
     * Devuelve una comparacion entre la antigüedad de dos aeropuertos.
     * @return 
     */
    @Override
    public int compareTo(Aereopuerto o) {
        
        if (this.aniosAbierto() < o.aniosAbierto()) {
            return 1;
        }else if (this.aniosAbierto() > o.aniosAbierto()) {
            return -1;
        }else {
            return 0;
        }
        
    }
    
    //CREANDO METODO ABSTRACTO
    
    /**
     * Devuelve la descripción completa de un aeropuerto.
     * @return 
     */
    public abstract void gananciasTotales(double cantidad);

    @Override
    public String toString() {
        return "Aereopuerto : " +"\n"+ "nombre=" + nombre 
                + "\n"+"id="+id+"\n"+"direccion=" 
                + direccion 
                +"\n"+ "año de inauguración=" + anio_in +"\n"
                + "capacidad=" + capacidad 
                +"\n"+ "aviones=" + mostrarAviones() 
                + "num_aviones=" + num_aviones +"\n";
    }
    
    
    
}
