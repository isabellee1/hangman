import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class J here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class J extends Actor
{
    /**
     * Act - do whatever the J wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public J(){
            GreenfootImage img = new GreenfootImage("images/J.png");
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

    else if (list.get(list.size() - 1).equals("J")) {
        getWorld().removeObject(this);
    }
}
}
