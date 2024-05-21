import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cloud1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cloud1 extends Actor
{
    /**
     * Act - do whatever the cloud1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public cloud1(){
       int ran = Greenfoot.getRandomNumber(6)+3;
        GreenfootImage img = new GreenfootImage("/Users/isabellee/Desktop/hangman/images/cloud1.png");
        img.scale(img.getWidth()/ran, img.getHeight()/ran);
        setImage(img);
    }
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        setLocation(getX(),getY()-1); 
        if(getY()<=10){
             getWorld().removeObject(this);
        }
    }
}
