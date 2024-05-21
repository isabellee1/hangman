import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Y here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Y extends Actor
{
    /**
     * Act - do whatever the Y wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Y(){
            GreenfootImage img = new GreenfootImage("images/Y.png");
        img.scale(img.getWidth()/6, img.getHeight()/6);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
