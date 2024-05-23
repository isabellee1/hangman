import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class P here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P extends Actor
{
    /**
     * Act - do whatever the P wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public P(){
            GreenfootImage img = new GreenfootImage("images/P.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
