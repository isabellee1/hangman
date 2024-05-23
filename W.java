import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W extends Actor
{
    /**
     * Act - do whatever the W wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public W(){
            GreenfootImage img = new GreenfootImage("images/W.png");
        img.scale(img.getWidth()/8, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
