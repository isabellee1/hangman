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
        addObject(new balloon1(),435,176);
        addObject(new balloon2(),425,165);
        addObject(new balloon3(),450,140);
        addObject(new balloon4(),400,150);
        addObject(new balloon5(),440,155);
        addObject(new balloon6(),420,145);
        addObject(new man(),420,250);
        addObject(new monster(), 250,350);
        
        //LETTERS
        addObject(new A(),20,176);
        addObject(new B(),50,176);
        addObject(new C(),80,176);
        addObject(new D(),110,176);
        addObject(new E(),140,176);
        addObject(new F(),170,176);
        addObject(new G(),200,176);
        addObject(new H(),230,176);
        addObject(new I(),258,176);
        addObject(new J(),286,176);
        addObject(new K(),20,220);
        addObject(new L(),50,220);
        addObject(new M(),80,220);
        addObject(new N(),110,220);
        addObject(new O(),140,220);
        addObject(new P(),170,220);
        addObject(new Q(),200,220);
        addObject(new R(),230,220);
        addObject(new S(),258,220);
        addObject(new T(),288,220);
        addObject(new U(),80,264);
        addObject(new V(),110,264);
        addObject(new W(),142,264);
        addObject(new X(),172,264);
        addObject(new Y(),200,264);
        addObject(new Z(),230,264);
        

    }
    private void showCategory()
    {
        String category = Greenfoot.ask("Please name the category of the word");
        showText("Category: " + category, 300, 20);
    }
    
}
