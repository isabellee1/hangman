import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class O here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class O extends Actor
{
    /**
     * Act - do whatever the O wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public O(){
            GreenfootImage img = new GreenfootImage("images/O.png");
        img.scale(img.getWidth()/6, img.getHeight()/7);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
