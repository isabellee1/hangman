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

       GreenfootImage img = new GreenfootImage("images/man.png");
        img.scale(img.getWidth()/3, img.getHeight()/3);
         setImage(img);

    }
    public void act()
    {
        MyWorld myWorld = (MyWorld)getWorld();
        
        if(myWorld.getGameOver() == true){
            setLocation(getX(),getY()+5); 
        }
        if(getY()>=390){
             getWorld().removeObject(this);
        }
        // Add your action code here.
            
    }
}
