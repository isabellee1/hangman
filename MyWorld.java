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
    private String word;
    private int wrong;
    private int right;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        int x = 40;
        int y = 70;
        this.word = Greenfoot.ask("What word/phrase will your friend be trying to guess?");
        
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
        Greenfoot.start();
        addObject(new balloon1(),429,153);
        addObject(new balloon2(),490,160);
        addObject(new balloon3(),471,156);
        addObject(new balloon4(),455,193);
        addObject(new balloon5(),450,146);
        addObject(new balloon6(),462,134);
        addObject(new man(),420,250);
        
        //LETTERS
        addObject(new A(),20,176);
        addObject(new B(),50,176);
        addObject(new C(),80,176);
        addObject(new D(),110,176);
        addObject(new E(),140,176);
        addObject(new F(),170,176);
        addObject(new G(),200,176);
        addObject(new H(),230,176);
        addObject(new I(),260,176);
        addObject(new J(),290,176);
        addObject(new K(),20,220);
        addObject(new L(),50,220);
        addObject(new M(),80,220);
        addObject(new N(),110,220);
        addObject(new O(),140,220);
        addObject(new P(),170,220);
        addObject(new Q(),200,220);
        addObject(new R(),230,220);
        addObject(new S(),260,220);
        addObject(new T(),290,220);
        addObject(new U(),80,264);
        addObject(new V(),110,264);
        addObject(new W(),140,264);
        addObject(new X(),170,264);
        addObject(new Y(),200,264);
        addObject(new Z(),230,264);
        

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
        String key = Greenfoot.getKey();
      
        //for(int i =0; i < word.length(); i++){
          // if(key != null && key != word.substring(i,i+1)){
            //addObject(new wrong_letter(), 150,150);
            //} 
        
        search();
        
    }
    public void search(){
        int x = -10;
     
        int x_wrong = 20;
        int y_wrong = 176;
        for(int i =0; i < word.length(); i++){
            x+=50;
           if(Greenfoot.isKeyDown(word.substring(i,i+1))){
            showText(word.substring(i,i+1), x, 62);
            
        } 
                
        }
        
    }
    
    public void gameOver(){
        if(wrong==word.length()){
            
        }
    }
    
    
}
