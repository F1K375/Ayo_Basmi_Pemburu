import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int nilai = 0;
    public Score(){
       setImage(new GreenfootImage("Score : " + nilai, 30, Color.BLACK, Color.WHITE));
   }
   
   public void update(int a){
       nilai += a;
       setImage(new GreenfootImage("Score : " + nilai, 30, Color.BLACK, Color.WHITE));
   }    
}
