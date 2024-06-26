import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon5 extends Actor
{
    /**
     * Act - do whatever the balloon5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balloon5(){
       GreenfootImage img = new GreenfootImage("images/balloon5.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
        setRotation(340);
    }
    public void act()
    {
        MyWorld myWorld  = (MyWorld) getWorld();
        if(myWorld.getWrong() ==6){
           Greenfoot.playSound("balloon_pop.wav");
            myWorld.removeObject(this); 
        }// Add your action code here.
    }
}
