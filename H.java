import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class H here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class H extends Actor
{
    /**
     * Act - do whatever the H wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public H(){
            GreenfootImage img = new GreenfootImage("images/H.png");
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

    else if (list.get(list.size() - 1).equals("H")) {
        getWorld().removeObject(this);
    }
}
}
