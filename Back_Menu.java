import greenfoot.*;

/**
 * Write a description of class Back_Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_Menu extends Actor
{
    /**
     * Act - do whatever the Back_Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new Start());
    }    
}
