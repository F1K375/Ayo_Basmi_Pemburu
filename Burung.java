import greenfoot.*;

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burung extends Hewan
{
    /**
     * Act - do whatever the Burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound burung = new GreenfootSound ("burung.mp3");
    public void act(){
        setLocation(getX()+1,getY());
        if(isAtEdge()){
            burung.play();
            setLocation(20,Greenfoot.getRandomNumber(100)+50);
        }
    }    
}
