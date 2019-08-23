import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Ledakan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Boom extends Peluru
{
    private final static int IMAGE_COUNT= 8;
    private static GreenfootImage[] images;
    private int imageNo = 0;
    private int increment=1;    
    GreenfootSound meledak = new GreenfootSound ("meledak.wav");
    public Boom() {
        initialiseImages();
        setImage(images[0]); 
        meledak.play();
    }    
    
    public synchronized static void initialiseImages() {
        if(images == null) {
            GreenfootImage baseImage = new GreenfootImage("explosion.png");
            int maxSize = baseImage.getWidth()/2;
            int delta = maxSize / (IMAGE_COUNT+1);
            int size = 0;
            images = new GreenfootImage[IMAGE_COUNT];
            for(int i=0; i < IMAGE_COUNT; i++) {
                size = size + delta;
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
            }
        }
    }
    
    public void act()
    { 
        if(imageNo > 0) {
            setImage(images[imageNo]);
        }

        imageNo += increment;
        if(imageNo >= IMAGE_COUNT) {
            increment = -increment;
            imageNo += increment;
        }
        
        if(imageNo <= 0) {
            setImage(new GreenfootImage(1,1));
        }
       
    }
}