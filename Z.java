import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Z extends Actor
{
    /**
     * Act - do whatever the Z wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Z(){
            GreenfootImage img = new GreenfootImage("images/Z.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
