/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Cordero
 */
public class Bicycle
{
    protected int cadence;
    protected int gear;
    protected int speed;

    public Bicycle()
    {
        
    }

    public Bicycle(int cadence, int gear, int speed)
    {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    /**
     * @return the cadence
     */
    public int getCadence()
    {
        return cadence;
    }

    /**
     * @param cadence the cadence to set
     */
    public void setCadence(int cadence)
    {
        this.cadence = cadence;
    }

    /**
     * @return the gear
     */
    public int getGear() 
    {
        return gear;
    }

    /**
     * @param gear the gear to set
     */
    public void setGear(int gear) 
    {
        this.gear = gear;
    }

    /**
     * @return the speed
     */
    public int getSpeed()
    {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public void applyBreak(int frenar)
    {
        
    }
    
    public void speedUp(int avanzar)
    {
        
    }

    @Override
    public String toString() {
        return "Datos de las Bicicletas" +
                "\nCadencia...:[" + cadence + "]"+ 
                "\nEngranaje..:[" + gear    + "]"+
                "\nVelocidad..:[" + speed   + "]"+
                "\n-------------------------------";
    }
    
    
    
    
}
