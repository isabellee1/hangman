import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class F here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F extends Actor
{
    /**
     * Act - do whatever the F wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public F(){
            GreenfootImage img = new GreenfootImage("images/f.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}
