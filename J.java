import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class J here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class J extends Actor
{
    /**
     * Act - do whatever the J wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public J(){
            GreenfootImage img = new GreenfootImage("images/J.png");
        img.scale(img.getWidth()/4, img.getHeight()/4);
        setImage(img);    
        }
    public void act()
    {
        // Add your action code here.
    }
}