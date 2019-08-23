import greenfoot.*;

/**
 * Write a description of class Gerakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerakan extends Actor
{
    /**
     * Act - do whatever the Gerakan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    int gravitasi = 1;
    int speed_jatuh = 0;
    public boolean bawah_tanah(){
        int x = getX();
        int y = getY();
        Actor tanah = getOneIntersectingObject(Tanah.class);
        setLocation(x,y+3);
        return (tanah!=null);
    }
    
    public boolean nabrak_tanah(String arah){
        int x=0;
        int y=0;
        if(arah == "kiri"){
            x=getX()-3;
            y=getY();
        }else if(arah == "kanan"){
            x=getX()+3;
            y=getY();}
        int Xttp = getX();
        int Yttp = getY();
        setLocation(x,y);
        Actor dinding = getOneIntersectingObject(Tanah.class);
        setLocation(Xttp,Yttp);
        return dinding == null;
    }
    
    public boolean kena_tanah(){
        int x = getX();
        int y = getY();
        int y1 = getY()+3;
        setLocation(x,y1);
        Actor tanah = getOneIntersectingObject(Tanah.class);
        setLocation(x,y-1);
        return (tanah!=null);
        //Object tanah_atas = getOneObjectAtOffset(0,getImage().getHeight()/2,Tanah.class);
        //return tanah_atas != null;
    }
    public void cek_jatuh(){
        if(kena_tanah())
            setJatuh(0);
        else
            jatuh();
    }
    
    public void setJatuh(int x){
        speed_jatuh = x;
    }
    
    public void jatuh(){
        setLocation(getX(),getY()+speed_jatuh);
        if(bawah_tanah()){
            setLocation(getX(),getY()-(speed_jatuh));
            setLocation(getX(),getY());
        }
        speed_jatuh+=gravitasi;
    }
}
