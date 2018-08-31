/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Cordero
 */
public class RoadBike extends Bicycle
{
    protected int ruedas;

    public RoadBike()
    {
        
    }

    public RoadBike(int ruedas)
    {
        this.ruedas = ruedas;
    }

    public RoadBike(int cadence, int gear, int speed,int ruedas)
    {
        super(cadence, gear, speed);
        this.ruedas = ruedas;
    }

    /**
     * @return the ruedas
     */
    public int getRuedas()
    {
        return ruedas;
    }

    /**
     * @param ruedas the ruedas to set
     */
    public void setRuedas(int ruedas) 
    {
        this.ruedas = ruedas;
    }

    
    @Override
    public String toString() {
        return "Datos de las Bicicletas de Ruta" +
                "\nCadencia...:[" + cadence +"]"+ 
                "\nEngranaje..:[" + gear    +"]"+ 
                "\nVelocidad..:[" + speed   +"]"+
                "\nRuedas.....:[" + ruedas  +"]"+
                "\n-------------------------------------";
    }
    
    
    
    
}
