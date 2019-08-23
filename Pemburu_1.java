import greenfoot.*;

/**
 * Write a description of class Pemburu_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pemburu_1 extends Pemburu
{
    /**
     * Act - do whatever the Pemburu_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int time = 1000, time1 = 240;
    int x1=435, x2=345, x3=1025, x4=765;
    int kurang = 2;
    public void act(){
        Dunia dn = (Dunia)getWorld();
        if(dn.level==1){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                setLocation(getX()-2,getY());
            }if(time<=0){
                World world = getWorld();
                P_Pemburu peluru = new P_Pemburu();
                world.addObject(peluru, getX()+45, getY()-16);
                peluru.setRotation(0);
                time = 120-kurang;
                kurang=kurang+5;
            }time--;
        }if(dn.level==2){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x3=x3-2; x4=x4-2;
            }pemburu_1_1();
            pemburu_1_2();
            if(time1<=0){
                World world = getWorld();
                P_Pemburu peluru = new P_Pemburu();
                if(a==2){
                    world.addObject(peluru, getX()-25, getY()-16);
                    peluru.setRotation(180);}
                if(a==1){
                    world.addObject(peluru, getX()+25, getY()-16);
                    peluru.setRotation(0);}
                time1 = 120;
            }time1--;
        } if(isTouching(Polisi.class))
            dn.gameover();
    }
    
    private void pemburu_1_1(){
        if(a==1&&getY()==243){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x1)
                a=2;
            setLocation(getX()+kecepatan,getY());
        }if(a==2&&getY()==243){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x2)
                 a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
    
    private void pemburu_1_2(){
        if(a==1&&getY()==422){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x3)
                a=2;
            setLocation(getX()+kecepatan,getY());
        }if(a==2&&getY()==422){
             setImage("hunter kiri - kecil.png");
             if(getX()<=x4)
                a=1;
             setLocation(getX()-kecepatan,getY());
        }
    }
}
