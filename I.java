import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class I here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class I extends Actor
{
    /**
     * Act - do whatever the I wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public I(){
            GreenfootImage img = new GreenfootImage("images/I.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
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

    else if (list.get(list.size() - 1).equals("I")) {
        getWorld().removeObject(this);
    }
}
}
