import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class man extends Actor
{
    /**
     * Act - do whatever the man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public man(){
       GreenfootImage img = new GreenfootImage("/Users/isabellee/Desktop/hangman/images/man.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
    public void act()
    {
        // Add your action code here.
    }
}