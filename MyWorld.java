
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
    private ArrayList<String> guessedLetters;
    private ArrayList<String> rightLetters;
    private ArrayList<Character> wrongLetters;
    private int wrong;
    private int right;
    private boolean gameOver;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(playAgain.class,dead.class,alive.class,gameOverB.class, gameWonB1.class,A.class, B.class, C.class,D.class, E.class,F.class,G.class,E.class,F.class,G.class,H.class,I.class,J.class,K.class,L.class,M.class,N.class,O.class,P.class,Q.class,R.class,S.class,T.class,U.class,V.class,W.class,X.class,Y.class,Z.class, 
        textCloud.class,balloon1.class,balloon2.class,man.class,cloud1.class); 
        
        int x = 40;
        int y = 70;
        gameOver = false;
        this.word = Greenfoot.ask("What word/phrase will your friend be trying to guess? (less than 12 characters)");
        rightLetters = new ArrayList<>();
        guessedLetters = new ArrayList<>();
        wrongLetters = new ArrayList<>();
        
           for(int i =0; i < word.length(); i++){
            if((word.substring(i,i+1).equals("-"))|| (word.substring(i,i+1).equals("/")) || (word.substring(i,i+1).equals("'")) || (word.substring(i,i+1).equals("."))){
               showText(word.substring(i,i+1),x,60); 
               x+=50;
            }
            else if(!(word.substring(i,i+1).equals(" "))){
                 rightLetters.add(word.substring(i,i+1));
                addObject(new textCloud(),x,60);
                 
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
                        
                    }
                }
                if (!found) {
                    wrongLetters.add(guessedLetter);
                    
                    wrong++;
                    
                }
                
                checkGameOver();
            }
        }
    }
     private void checkGameOver() {
        if (wrong >= 6) {
            gameOver = true; 
            addObject(new gameOverB(), 300, 10);
            addObject(new gameOverB(), 300, 350);
            addObject(new dead(), 188,181);
            Greenfoot.playSound("game_over.wav");
            showText("Game Over! The word was: " + word, 300, 375);
            addObject(new playAgain(), 430, 221);
            
        }
    if(right >= word.length() || right >= rightLetters.size()){
        
        Greenfoot.playSound("win.mp3");
    
        addObject(new gameWonB1(), 300, 200); 
        addObject(new alive(), 153,233);
        showText("You Won! Congratulations!!", 404, 215);
         addObject(new playAgain(), 404, 301);   
        }
       
    }
    public int getWrong(){
        return wrong;
    }
    public ArrayList getWrongList(){
        return wrongLetters;
    }
    public boolean getGameOver(){
        return gameOver;
    }
    public ArrayList getGuessedList(){
        return guessedLetters;
    }
        
    
   
    
    
}
