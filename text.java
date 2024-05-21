import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class text extends Actor
{
    
    public text(){
       GreenfootImage img = new GreenfootImage("images/thin-black-line.png");
        img.scale(img.getWidth()/10, img.getHeight());
        setImage(img);
    }
    public void act(){
        
    }
}
    

