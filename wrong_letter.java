import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wrong_letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wrong_letter extends Actor
{
    /**
     * Act - do whatever the wrong_letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public wrong_letter(){
         GreenfootImage img = new GreenfootImage("images/skull.png");
        img.scale(img.getWidth()/2, img.getHeight()/2);
        setImage(img);   
    }
    public void act()
    {
        // Add your action code here.
    }
}
