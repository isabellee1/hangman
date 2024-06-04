import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P extends Actor
{
    /**
     * Act - do whatever the P wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public P(){
            GreenfootImage img = new GreenfootImage("images/P.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        MyWorld myWorld = (MyWorld) getWorld();
    ArrayList<String> list = myWorld.getGuessedList();
    
    if(myWorld.getGameOver()==true){
        getWorld().removeObject(this);
    }
   
    else if (list.size() == 0) {
        return;
    }

    else if (list.get(list.size() - 1).equals("P")) {
        getWorld().removeObject(this);
    }
}
}
