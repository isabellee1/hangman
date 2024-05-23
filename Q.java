import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Q here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q extends Actor
{
    /**
     * Act - do whatever the Q wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Q(){
            GreenfootImage img = new GreenfootImage("images/Q.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
