import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon6 extends Actor
{
    /**
     * Act - do whatever the balloon6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balloon6(){
       GreenfootImage img = new GreenfootImage("images/balloon6.png");
       img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
    public void act()
    {
        MyWorld myWorld  = (MyWorld) getWorld();
        if(myWorld.getWrong() ==5){
           Greenfoot.playSound("balloon_pop.wav");
            myWorld.removeObject(this); 
        }// Add your action code here.
    }
}
