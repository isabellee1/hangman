import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class W here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W extends Actor
{
    /**
     * Act - do whatever the W wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public W(){
            GreenfootImage img = new GreenfootImage("images/W.png");
        img.scale(img.getWidth()/8, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
            MyWorld myWorld = (MyWorld) getWorld();
    ArrayList<Character> list = myWorld.getWrongList();

   
    if (list.size() == 0) {
        return;
    }

    else if (list.get(list.size() - 1).equals('W')) {
        getWorld().removeObject(this);
    }// Add your action code here.// Add your action code here.
    }
}
