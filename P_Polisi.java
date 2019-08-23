import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P_Polisi extends Peluru
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound tembak = new GreenfootSound ("tembak.wav");
    public P_Polisi(){
        tembak.play();
    }
    public void act(){
       Dunia dn = (Dunia)getWorld();
       gerak();
       if(isTouching(Pemburu.class)){
            dn.score().update(50);
            getWorld().addObject(new Boom(), getX(),getY());
            removeTouching(Pemburu.class);
            hapus();
       }else if(isTouching(Tanah.class)||isAtEdge()){
           getWorld().addObject(new Boom(), getX(),getY()); 
           hapus();
       }
    }
}
