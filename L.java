import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // Add your action code here.
    }
}
