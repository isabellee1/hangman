import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class T here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class T extends Actor
{
    /**
     * Act - do whatever the T wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public T(){
            GreenfootImage img = new GreenfootImage("images/T.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
