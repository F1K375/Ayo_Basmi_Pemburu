import greenfoot.*;

/**
 * Write a description of class Jerapah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jerapah extends Hewan
{
    /**
     * Act - do whatever the Jerapah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a=1;
    int x2=1483, x1=1753, x3=1749, x4=1509; 
    public void act() {
        Dunia dn = (Dunia)getWorld();
        if(dn.level==1){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x1=x1-2; x2=x2-2;}
            if(a==1){
                setImage("5 - kecil.png");
                if(getX()>=x1)
                    a=2;
                setLocation(getX()+speed,getY());
            }
            if(a==2){
                setImage("55 - kecil.png");
                if(getX()<=x2)
                    a=1;
                    setLocation(getX()-speed,getY());
            }
        }if(dn.level==2){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x3=x3-2; x4=x4-2;}
            if(a==1){
                setImage("5 - kecil.png");
                if(getX()>=x3)
                    a=2;
                setLocation(getX()+speed,getY());
            }
            if(a==2){
                setImage("55 - kecil.png");
                if(getX()<=x4)
                    a=1;
                    setLocation(getX()-speed,getY());
            }
        }Tertembak();
    }
}
