import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Level(int lvl){
        setImage(new GreenfootImage("Level " + lvl, 50, Color.BLACK, Color.WHITE));
    }
    public Level(){}
    
    public void Dunia_jalan(){
        Dunia dn = (Dunia)getWorld();
        if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380)
            setLocation(getX()-2, getY());
        if(getX()== -480)
            setLocation(getX()+1920, getY());
    }
}
