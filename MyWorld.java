
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

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
    private List<String> guessedLetters;
    private List<String> wrongLetters;
    private int wrong;
    private int right;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        int x = 40;
        int y = 70;
        this.word = Greenfoot.ask("What word/phrase will your friend be trying to guess?");
        guessedLetters = new ArrayList<>();
        wrongLetters = new ArrayList<>();
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
        search();
        
    }
    
    public void search() {
        String key = Greenfoot.getKey();
        if (key != null && key.length() == 1) {
            char guessedLetter = key.toUpperCase().charAt(0);
            if (Character.isLetter(guessedLetter) && !guessedLetters.contains("" + guessedLetter)) {
                guessedLetters.add("" + guessedLetter);
                boolean found = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.toUpperCase().charAt(i) == guessedLetter) {
                        showText("" + guessedLetter, 40 + i * 50, 62);
                        found = true;
                        right++;
                        System.out.print(right);
                    }
                }
                if (!found) {
                    wrong++;
                    addObject(new wrong_letter(), 20 + (wrong - 1) * 30, 300);
                }
                
                checkGameOver();
            }
        }
    }
     private void checkGameOver() {
        if (wrong >= 6) {
            showText("Game Over! The word was: " + word, 300, 300);
            Greenfoot.stop();
        }
        if(right >= word.length()){
          showText("You Won! Congratulations", 300, 300);
            Greenfoot.stop();  
        }
       
    }
        
    
   
    
    
}
