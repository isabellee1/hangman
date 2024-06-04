import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class U here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U extends Actor
{
    /**
     * Act - do whatever the U wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public U(){
            GreenfootImage img = new GreenfootImage("images/U.png");
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

    else if (list.get(list.size() - 1).equals("U")) {
        getWorld().removeObject(this);
    }
}
}
