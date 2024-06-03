import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playAgain extends Actor
{
    /**
     * Act - do whatever the playAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public playAgain(){
            GreenfootImage img = new GreenfootImage("images/playAgain.png");
        img.scale(img.getWidth()/2,img.getHeight()/2);
        setImage(img);    
        }
    public void act()
    {
        
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
