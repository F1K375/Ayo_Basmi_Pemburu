import greenfoot.*;

/**
 * Write a description of class Kuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kuda extends Hewan
{
    /**
     * Act - do whatever the Kuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a=1;
    int x2=760, x1=860,x3=255,x4=135; 
    public void act() {
        Dunia dn = (Dunia)getWorld();
        if(dn.level==1){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x1=x1-2; x2=x2-2;}
            if(a==1){
                setImage("33 - kecil.png");
                if(getX()>=x1)
                     a=2;
                setLocation(getX()+speed,getY());
            }
            if(a==2){
                setImage("3 - kecil.png");
                if(getX()<=x2)
                    a=1;
                setLocation(getX()-speed,getY());
            }
        }if(dn.level==2){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x3=x3-2; x4=x4-2;}
            if(a==1){
                setImage("33 - kecil.png");
                if(getX()>=x3)
                     a=2;
                setLocation(getX()+speed,getY());
            }
            if(a==2){
                setImage("3 - kecil.png");
                if(getX()<=x4)
                    a=1;
                setLocation(getX()-speed,getY());
            }
        }
    }  
}
