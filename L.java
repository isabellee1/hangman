import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class L here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L extends Actor
{
    /**
     * Act - do whatever the L wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public L(){
            GreenfootImage img = new GreenfootImage("images/L.png");
        img.scale(img.getWidth()/6, img.getHeight()/7);
        setImage(img);    
        }
    public void act()
    {
            MyWorld myWorld = (MyWorld) getWorld();
    ArrayList<Character> list = myWorld.getWrongList();
    
   
    if (list.size() == 0) {
        return;
    }

    else if (list.get(list.size() - 1).equals('L')) {
        getWorld().removeObject(this);
    }// Add your action code here.// Add your action code here.
    }
}
