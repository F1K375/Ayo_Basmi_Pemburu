import greenfoot.*;

/**
 * Write a description of class Anthelope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anthelope extends Hewan
{
    /**
     * Act - do whatever the Anthelope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a=1;
    int x2=1091, x1=1211, x3=590, x4=495, x5=1211, x6=1150; 
    public void act() {
        Dunia dn = (Dunia)getWorld();
        if(dn.level==1){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x1=x1-2; x2=x2-2;}
            if(a==1){
                setImage("77 - kecil.png");
                if(getX()>=x1)
                    a=2;
                setLocation(getX()+speed,getY());
            }
            if(a==2){
                setImage("7 - kecil.png");
                if(getX()<=x2)
                    a=1;
                setLocation(getX()-speed,getY());
            }
        }if(dn.level==2){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x3=x3-2; x4=x4-2;
                x5=x5-2; x6=x6-2;
            }
            anthelope_1();
            anthelope_2();
        }Tertembak();
    }
    
    private void anthelope_1(){
        if(a==1&&getY()==239){
            setImage("77 - kecil.png");
            if(getX()>=x3)
                a=2;
            setLocation(getX()+speed,getY());
        }
        if(a==2&&getY()==239){
            setImage("7 - kecil.png");
            if(getX()<=x4)
                a=1;
            setLocation(getX()-speed,getY());
        }
    }
    
     private void anthelope_2(){
        if(a==1&&getY()==421){
            setImage("77 - kecil.png");
            if(getX()>=x5)
                a=2;
            setLocation(getX()+speed,getY());
        }
        if(a==2&&getY()==421){
            setImage("7 - kecil.png");
            if(getX()<=x6)
                a=1;
            setLocation(getX()-speed,getY());
        }
    }
}
