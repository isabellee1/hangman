import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class alive extends Actor
{
    /**
     * Act - do whatever the alive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public alive(){
            GreenfootImage img = new GreenfootImage("images/alive.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
