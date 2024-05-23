import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class N here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N extends Actor
{
    /**
     * Act - do whatever the N wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public N(){
            GreenfootImage img = new GreenfootImage("images/N.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
