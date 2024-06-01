import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class K here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class K extends Actor
{
    /**
     * Act - do whatever the K wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public K(){
            GreenfootImage img = new GreenfootImage("images/K.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
            MyWorld myWorld = (MyWorld) getWorld();
    ArrayList<Character> list = myWorld.getWrongList();
    
   
    if (list.size() == 0) {
        return;
    }

    else if (list.get(list.size() - 1).equals('K')) {
        getWorld().removeObject(this);
    }// Add your action code here.// Add your action code here.
    }
}
