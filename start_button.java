import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start_button extends Actor
{
    /**
     * Act - do whatever the start_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void clickButton()
{
    if(Greenfoot.mouseClicked(this))
    {
        Greenfoot.setWorld(new MyWorld());
        
    }
}
}
