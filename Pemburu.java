import greenfoot.*;

/**
 * Write a description of class Pemburu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pemburu extends Gerakan
{
    /**
     * Act - do whatever the Pemburu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int kecepatan = 4;
    int a=1;
    int x1=650, x2=339, x3=700, x4=315, x5=1440, x6=1271;
    int x7=920, x8=880, x9=1420, x10=1240;
    int delay = 60;
    public void act() {
        Dunia dn = (Dunia)getWorld();
        if(dn.level==1){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x1=x1-2; x2=x2-2;
                x3=x3-2; x4=x4-2;
                x5=x5-2; x6=x6-2;
            }
            //pemburu yang pertama
            Pemburu1();
            //pemburu yang kedua
            Pemburu2();
            //pemburu yang ketiga
            Pemburu3();
        }if(dn.level==2){
            if(Greenfoot.isKeyDown("Right")&&dn.cek().getX()>=380){
                x7=x7-2; x8=x8-2;
                x9=x9-2; x10=x10-2;
            }
            //Pemburu yang pertama di level_2
            Pemburu4();
            //Pemburu yag kedua di level_2
            Pemburu5();
        }if(delay<=0){
            World world = getWorld();
            P_Pemburu peluru = new P_Pemburu();
            if(a==2){
                    world.addObject(peluru, getX()-25, getY()-16);
                    peluru.setRotation(180);}
            if(a==1){
                    world.addObject(peluru, getX()+25, getY()-16);
                    peluru.setRotation(0);}
            delay = 60;
        }    
        if(isTouching(Polisi.class))
            dn.gameover();
        delay--;
    }
    
    private void Pemburu1(){
        if(a==1&&getY()==275){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x1)
                a=2;
            setLocation(getX()+kecepatan,getY());
        }
        else if(a==2&&getY()==275){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x2)
                a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
    
    private void Pemburu2(){
        if(a==1&&getY()==425){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x3)
                a=2;
            setLocation(getX()+kecepatan,getY());
        }
        else if(a==2&&getY()==425){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x4)
                a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
    
    private void Pemburu3(){
        if(a==1&&getY()==185){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x5)
                a=2;
            setLocation(getX()+kecepatan,getY());
        }
        else if(a==2&&getY()==185){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x6)
                a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
    
    private void Pemburu4(){
        if(a==1&&getY()==123){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x7)
                a=2;
            setLocation(getX()+kecepatan,getY());
        } if(a==2&&getY()==123){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x8)
                a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
    
    private void Pemburu5(){
         if(a==1&&getY()==186){
            setImage("hunter kanan - kecil.png");
            if(getX()>=x9)
                a=2;
            setLocation(getX()+kecepatan,getY());
        } if(a==2&&getY()==186){
            setImage("hunter kiri - kecil.png");
            if(getX()<=x10)
                a=1;
            setLocation(getX()-kecepatan,getY());
        }
    }
}
