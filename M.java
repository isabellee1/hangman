import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class M here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M extends Actor
{
    /**
     * Act - do whatever the M wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public M(){
            GreenfootImage img = new GreenfootImage("images/M.png");
        img.scale(img.getWidth()/7, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
