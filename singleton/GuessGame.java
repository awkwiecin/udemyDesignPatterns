package pl.awkwiecin.singleton;

import java.util.Random;

public class GuessGame {
    //-------------------Constructor------------------------------//
    private GuessGame() {

    }
    //-----------------Fields--------------------------------//
    private Random rnd = new Random();

    private int draw;
    private int drawMin=1;
    private int drawMax=9;

    private int score;
    private int guess;

    private static GuessGame instance;

    //-------------------------------------------------//
    private void drawNumber() {
        draw = rnd.nextInt((drawMax-drawMin+1)+drawMin);
    }

    public void play() {

        this.drawNumber();
        if(this.draw==this.guess) {
            score+=1;
        }
    }

    public static synchronized GuessGame getInstance() {
        if (instance==null) {
            instance=new GuessGame();
        }

        return instance;
    }

    //------------------Getters&setters-------------------------------//
    public int getScore() {
        return score;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    //-------------------------------------------------//
}
