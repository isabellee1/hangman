import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textCloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textCloud extends Actor
{
    /**
     * Act - do whatever the textCloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public textCloud(){
       GreenfootImage img = new GreenfootImage("images/textCloud.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);
        
    }
    public void act()
    {
        // Add your action code here.
    }
}
