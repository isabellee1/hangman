import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        int x = 40;
        int y = 70;
        String word = Greenfoot.ask("What word/phrase will your friend be trying to guess?");
        
        for(int i =0; i < word.length(); i++){
            if(!(word.substring(i,i+1).equals(" "))){
                 addObject(new text(),x,y);
                 x+=50;
            }
            else{
                x+= 50;
            }
        }
        showCategory();
        addObject(new balloon1(),429,153);
        addObject(new balloon2(),490,160);
        addObject(new balloon3(),471,156);
        addObject(new balloon4(),455,193);
        addObject(new balloon5(),450,146);
        addObject(new balloon6(),462,134);
        addObject(new man(),420,250);
       
    }
    private void showCategory()
    {
        String category = Greenfoot.ask("Please name the category of the word");
        showText("Category: " + category, 300, 20);
    }
    public void act(){
        if (Greenfoot.getRandomNumber(100)<2){  
            addObject(new cloud1(), Greenfoot.getRandomNumber(600), 400);
        }
        

    }
    
    
}
