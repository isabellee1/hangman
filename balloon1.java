import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon1 extends Actor
{
    /**
     * Act - do whatever the balloon1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balloon1(){
       GreenfootImage img = new GreenfootImage("/Users/isabellee/Desktop/hangman/images/balloon1.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}
