/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game
    public String dealerName;
    public String verifyChips;
    public int stay;
    public int hit;
    public int blackJack;
    public int bust;

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    
    public String getDealerName() {
        return dealerName;
    }

    
    public String getVerifyChips() {
        return verifyChips;
    }

    public int getStay() {
        return stay;
    }

    public int getHit() {
        return hit;
    }
    
    public int getBlackJack() {
        return blackJack;
    }

    public int getBust() {
        return bust;
    }
    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
