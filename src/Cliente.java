/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Cordero
 */
public class Cliente
{

    
    protected String cedula;
    protected String nombre;
    protected int    edad;
    protected MountainBike[] miBiciMontania;
    protected int cantBicisMontania; 

    public Cliente()
    {
        
    }

    public Cliente(String cedula, String nombre, int edad,int cantBicisMontania)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.miBiciMontania= new MountainBike[cantBicisMontania];
        
        
    }
    
    

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * @return the miBiciMontania
     */
    public MountainBike[] getMiBiciMontania() {
        return miBiciMontania;
    }

    /**
     * @param miBiciMontania the miBiciMontania to set
     */
    public void setMiBiciMontania(MountainBike[] miBiciMontania) {
        this.miBiciMontania = miBiciMontania;
    }

    /**
     * @return the cantBicisMontania
     */
    public int getCantBicisMontania() {
        return cantBicisMontania;
    }

    /**
     * @param cantBicisMontania the cantBicisMontania to set
     */
    public void setCantBicisMontania(int cantBicisMontania) {
        this.cantBicisMontania = cantBicisMontania;
    }

    @Override
    public String toString() {
        return "Datos del Cliente" + 
               "\nCedula...:[" + cedula +"]"+
               "\nNombre...:[" + nombre + "]"+
               "\nEdad.....:[" + edad + "]"+
               "\n-----------------------------";
    }
    
    
    
    
    
}
