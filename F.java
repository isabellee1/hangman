import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class F here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F extends Actor
{
    /**
     * Act - do whatever the F wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public F(){
            GreenfootImage img = new GreenfootImage("images/f.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);    
        }
    public void act()
    {
        MyWorld myWorld = (MyWorld) getWorld();
    ArrayList<Character> list = myWorld.getWrongList();
  
   
    if (list.size() == 0) {
        return;
    }

    else if (list.get(list.size() - 1).equals('F')) {
        getWorld().removeObject(this);
    }// Add your action code here.
    }
}
