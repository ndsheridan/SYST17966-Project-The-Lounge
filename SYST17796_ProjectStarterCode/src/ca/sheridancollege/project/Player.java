/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; //the unique name for this player
    public int score;
    public int stay;
    public int hit;
    public int blackJack;
    public int bust;
    

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    public void setStay(int stay) {
        this.stay = stay;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void setBlackJack(int blackJack) {
        this.blackJack = blackJack;
    }

    public void setBust(int bust) {
        this.bust = bust;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
