import greenfoot.*;

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    Mulai start;
    Control ctrl;
    How play;
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        prepare();
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(start))
            Greenfoot.setWorld(new Dunia());
        if(Greenfoot.mouseClicked(ctrl))
            Greenfoot.setWorld(new Dn_Control());
        if(Greenfoot.mouseClicked(play))
            Greenfoot.setWorld(new Dn_HowToPlay());
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        start = new Mulai();
        addObject(start, 485, 153);
        ctrl = new Control();
        addObject(ctrl, 605, 223);
        play = new How();
        addObject(play, 363, 223);
        addObject(new Credit(), 485, 281);
    }
}
