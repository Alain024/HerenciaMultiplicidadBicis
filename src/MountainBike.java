/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Cordero
 */
public class MountainBike extends Bicycle
{
    protected String suspension;

    public MountainBike()
    {
        
    }

    public MountainBike(String suspension) {
        this.suspension = suspension;
    }

    public MountainBike(int cadence, int gear, int speed,String suspension)
    {
        super(cadence, gear, speed);
        this.suspension = suspension;
    }

    /**
     * @return the suspension
     */
    public String getSuspension()
    {
        return suspension;
    }

    /**
     * @param suspension the suspension to set
     */
    public void setSuspension(String suspension)
    {
        this.suspension = suspension;
    }

    
    @Override
    public String toString() {
        return  "\nCadencia...:[" + cadence + "]"+ 
                "\nEngranaje..:[" + gear    + "]"+
                "\nVelocidad..:[" + speed   + "]"+
                "\nSuspensión..[" + suspension+"]"+
                "\n-------------------------------";
    }
    
    
    
    
    
    
    
}
