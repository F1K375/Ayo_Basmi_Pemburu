import greenfoot.*;

/**
 * Write a description of class Hewan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hewan extends Gerakan
{
    /**
     * Act - do whatever the Hewan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public void Tertembak(){
        Dunia dn = (Dunia)getWorld();
        if(isTouching(P_Pemburu.class))
            dn.gameover();
    }
}
