import greenfoot.*;

/**
 * Write a description of class Gerbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerbang extends Actor
{
    /**
     * Act - do whatever the Gerbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        Dunia dn = (Dunia)getWorld();
        if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380)
            setLocation(getX()-2, getY());
        if(isTouching(Polisi.class)){
            dn.level++;
            dn.chooseLVL();
        }
    }    
}
