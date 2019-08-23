import greenfoot.*;

/**
 * Write a description of class Polisi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Polisi extends Gerakan
{
    /**
     * Act - do whatever the Polisi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 0;
    int posisi=2;
    String Arah=null;
    GreenfootSound lompat = new GreenfootSound ("lompat.mp3");
    GreenfootSound dapathewan = new GreenfootSound ("dapathewan.wav");
    public void act(){
        String arah = Arah();
        if(nabrak_tanah(arah)){
            if(Greenfoot.isKeyDown("Right")){
                setLocation(getX()+speed,getY());
                setImage("police hadap kanan - kecil.png");
                posisi=2;}
            if(Greenfoot.isKeyDown("Left")){
                setLocation(getX()-speed,getY());
                setImage("polisi hadap kiri - kecil.png");
                posisi=1;}
            if(Greenfoot.isKeyDown("Up")){
                lompat.play(); 
                if(kena_tanah()){
                    setJatuh(-(speed+15));
                    jatuh();}
            }if(Greenfoot.isKeyDown("Space")){
                if(delay<=0){
                World world = getWorld();
                P_Polisi peluru = new P_Polisi();    
                if(posisi==1){
                     world.addObject(peluru, getX()-30, getY()-14);
                     peluru.setRotation(180);}
                if(posisi==2){
                     world.addObject(peluru, getX()+30, getY()-14);
                     peluru.setRotation(0);}
                delay=20;
                } 
            }
        }
        cek_jatuh();
        cekTouching();
        cekPosisi();
        delay--;       
    }
    
    private void cekTouching(){
        Dunia dn = (Dunia)getWorld();
        if(isTouching(Rusa.class)){
           removeTouching(Rusa.class);
           dapathewan.play();
           dn.score().update(10);
        }else if(isTouching(Kuda.class)){
           removeTouching(Kuda.class);
           dapathewan.play();
           dn.score().update(10);
        }else if(isTouching(Phanter.class)){
           removeTouching(Phanter.class);
           dapathewan.play();
           dn.score().update(10);
        }else if(isTouching(Anthelope.class)){
           removeTouching(Anthelope.class);
           dapathewan.play();
           dn.score().update(10);
        }else if(isTouching(Singa.class)){
           removeTouching(Singa.class);
           dapathewan.play();
           dn.score().update(10);
        }else if(isTouching(Jerapah.class)){
           removeTouching(Jerapah.class);
           dapathewan.play();
           dn.score().update(10);}
    }
    
    private void cekPosisi(){
        Dunia dn = (Dunia)getWorld();
        if(getY()>540)
            dn.gameover();
        else if(getX()>=380)
            setLocation(380,getY());
        else if(getX()<=20)
            setLocation(20,getY());
    }
    
    private String Arah(){
        String arah = null;
        if(Greenfoot.isKeyDown("Left"))
            arah = "kiri";
        if(Greenfoot.isKeyDown("Right"))
            arah = "kanan";
        return arah;
    }
}
