import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balloon3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balloon3 extends Actor
{
    /**
     * Act - do whatever the balloon3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public balloon3(){
       GreenfootImage img = new GreenfootImage("images/balloon3.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
        setImage(img);
    }
    public void act()
    {
        MyWorld myWorld  = (MyWorld) getWorld();
        if(myWorld.getWrong() ==3){
           Greenfoot.playSound("balloon_pop.wav");
            myWorld.removeObject(this); 
        }// Add your action code here.
    }
}
