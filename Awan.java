import greenfoot.*;

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends Level
{
    /**
     * Act - do whatever the Awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        setLocation(getX()-1,getY());
        if(isAtEdge())
            setLocation(950,Greenfoot.getRandomNumber(100)+50);
    }    
}
