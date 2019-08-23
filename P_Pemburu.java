import greenfoot.*;

/**
 * Write a description of class P_Pemburu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P_Pemburu extends Peluru
{
    /**
     * Act - do whatever the P_Pemburu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Dunia dn = (Dunia)getWorld();
       gerak();
       if(isTouching(Polisi.class)){
            getWorld().addObject(new Boom(), getX(),getY());
            hapus();
            dn.gameover();
       }else if(isTouching(Tanah.class)||isAtEdge()){
            hapus();
       }else if(isTouching(P_Polisi.class)){
           getWorld().addObject(new Boom(), getX(),getY());
           removeTouching(P_Polisi.class);
           hapus();
       }
    }  
}
