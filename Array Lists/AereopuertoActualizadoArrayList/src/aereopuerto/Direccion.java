/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aereopuerto;

/**
 *
 * @author charlie
 *  * Mejoraremos la clase Aereopuerto agrupando algunos de los atributos de un objeto
 * Crea la calse direcctorio que tiene los siguientes atributos:
 * -Pais
 * -Calle
 * -Numero
 * -Ciudad
 * //
 * Dos constructores:
 * -Vacio
 * -Completo
 * //Meetodos
 * getter y setter
 * -toString();
 * Cambiar todos esos atributos de aereopuerto por direccion.
 */
 
public class Direccion {
    
    private String pais, ciudad, calle;
    private int num;

    public Direccion() {
        this("","","",0);
    }
    /**
     * Constructor Completo de Dirección
     * @param pais
     * @param ciudad
     * @param calle
     * @param num
     */
    public Direccion(String pais, String ciudad, String calle, int num) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.num = num;
    }
    /**
     * Devuelve el país del aereopuerto.
     * @return 
     */
    public String getPais() {
        return pais;
    }
    
    /**
     * Establece el país del aereopuerto.
     * @param pais 
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    /**
     * Devuelve la ciudad del aereopuerto.
     * @return 
     */
    public String getCiudad() {
        return ciudad;
    }
    /**
     * Establece la ciudad del aereopuerto.
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
     /**
     * Devuelve la calle del aereopuerto.
     * @return  
     */
    public String getCalle() {
        return calle;
    }
    /**
     * Establece la calle del aereopuerto.
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
     /**
     * Devuelve el numero del aereopuerto.
     * @return 
     */
    public int getNum() {
        return num;
    }
    /**
     * Establece el numero del aereopuerto.
     * @param num 
     */
    public void setNum(int num) {
        this.num = num;
    }
    
    /**
     * Devuelve una direccion comlpeta en string.
     * @return 
     */
    @Override
    public String toString() {
        return "Direccion:" + "pais=" + pais + ", ciudad=" + ciudad + ", calle=" + calle + ", num=" + num;
    }
    
    
}
