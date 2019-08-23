import greenfoot.*;
/**
 * Write a description of class Back_Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
    /**
     * Constructor for objects of class Back_Ground.
     * 
     */
    int level = 1;
    int Total=0;
    Polisi police = new Polisi();
    Tanah ground = new Tanah();
    Score Update;
    GreenfootSound menang = new GreenfootSound ("winning.wav");
    GreenfootSound backsound1 = new GreenfootSound ("mideviljaunt.mp3");
    GreenfootSound kalah = new GreenfootSound ("kalah.mp3");
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1, false);
        setPaintOrder(P_Polisi.class,P_Pemburu.class,Tanah.class,Polisi.class,Rusa.class,Kuda.class,Phanter.class,
        Anthelope.class,Singa.class, Jerapah.class,Pemburu.class,Score.class,Burung.class,Awan.class,Gerbang.class,
        Boom.class,Back_Menu.class,Level.class,Level_1.class,Level_2.class);
        chooseLVL();
        prepare();
        menang.stop();
        backsound1.playLoop();
    }

    public void chooseLVL(){
        if(level==1)
            Level1();
        else if(level==2)
            Level2();
        else
            Win();
    }

    private void Level1(){
        removeObjects(getObjects(Actor.class));
        addObject(new Level(level), 480, 50);
        Update = new Score();
        addObject(Update, 875, 23);
        addObject(police, 39, 415);
        addObject(new Rusa(), 195, 340);
        addObject(new Kuda(), 762, 340);
        addObject(new Anthelope(), 1020, 245);
        addObject(new Singa(), 1513, 275);
        addObject(new Jerapah(), 1633, 425);
        addObject(new Phanter(), 953, 285);
        addObject(new Pemburu(), 1331, 185);
        addObject(new Pemburu(), 653, 275);
        addObject(new Pemburu(), 400, 425);
        addObject(new Pemburu_1(), 1490, 425);
        addObject(new Level_1(), 480, 270);
        addObject(new Level_1(), 1440, 270);
        addObject(new Gerbang(), 1880, 425);
        Buat_tanah(ground.tanah_level1());
    }

    private void Level2(){
        Total = score().nilai;
        removeObjects(getObjects(Actor.class));
        addObject(new Level(level), 480, 25);
        Update = new Score();
        addObject(Update, 875, 23);
        score().update(Total);
        addObject(police, 39, 100);
        addObject(new Gerbang(), 2000,435);
        addObject(new Kuda(), 192, 308);
        addObject(new Phanter(), 680, 195);
        addObject(new Singa(), 675, 336);
        addObject(new Anthelope(), 567, 239);
        addObject(new Anthelope(), 1198, 421);
        addObject(new Rusa(), 1520, 430);
        addObject(new Jerapah(), 1548, 215);
        addObject(new Pemburu(), 900, 123);
        addObject(new Pemburu(), 1380, 186);
        addObject(new Pemburu_1(), 352, 243);
        addObject(new Pemburu_1(), 822, 422);
        addObject(new Level_2(), 480, 270);
        addObject(new Level_2(), 1440, 270);
        Buat_tanah(ground.tanah_level2());
    }
    
    private void Win(){
        Total = score().nilai;
        removeObjects(getObjects(Actor.class));
        backsound1.stop();
        menang.play();
        addObject(new YouWin(), 480,270);
        addObject(new Back_Menu(), 33, 32);
        addObject(new Total(Total), 480, 340);
        addObject(new Credit(), 480, 410);
    }
    
    public void gameover(){
        removeObjects(getObjects(Actor.class));
        backsound1.stop();
        kalah.play();
        addObject(new GameOver(), 480,270);
        addObject(new Back_Menu(), 33, 32);
    }
    
    private void Buat_tanah(int tanah[]){
        int a=0;
        for(int y=15; y<18*30;y+=30){
            for(int x=15;x<64*30;x+=30){
                int b = tanah[a];
                if(b==1)
                    addObject(new Tanah(),x,y);
                if(a<tanah.length-1)
                    a++;
            }
        }
    }
    
    public Score score(){
        return Update;
    }
    
    public Polisi cek(){
        return police;
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare(){
        addObject(new Awan(), 137, 64);
        addObject(new Awan(), 376, 135);
        addObject(new Awan(), 531, 62);
        addObject(new Awan(), 712, 107);
        addObject(new Awan(), 880, 47);
        addObject(new Burung(), 152, 114);
    }
}
