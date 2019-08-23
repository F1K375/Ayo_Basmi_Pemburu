import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Total here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Total extends Actor
{
    /**
     * Act - do whatever the Total wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Total(int total){
       setImage(new GreenfootImage("Score : " + total, 60, Color.BLACK, Color.WHITE));
   }  
}
