import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon4 extends Actor
{
    /**
     * Act - do whatever the balloon4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balloon4(){
       GreenfootImage img = new GreenfootImage("images/balloon4.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
