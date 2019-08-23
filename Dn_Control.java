import greenfoot.*;

/**
 * Write a description of class Dn_Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dn_Control extends World
{
    /**
     * Constructor for objects of class Dn_Control.
     * 
     */
    public Dn_Control()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        addObject(new Back_Menu(), 33, 32);
    }
}
