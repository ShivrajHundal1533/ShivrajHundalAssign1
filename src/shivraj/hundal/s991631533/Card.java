package shivraj.hundal.s991631533;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack =11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in Exercise 1. When you create your own branch,
 * add your name as an author.
 * @author dancye
 * @author Paul Bonenfant
 * @author Shivraj Hundal
 * @date June 6, 2021
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
   private int userSuit; //user inputs 0 - 3 to pick Suit
   
   public Card(){
       suit = SUITS[(int)(Math.random() * 4)];
       value = (int)(1 + Math.random() * 13);
   }

    public Card(int userSuit, int value) {
        this.userSuit = userSuit;
        suit = SUITS[userSuit];
        this.value = value;
    }

   public static final String [] FACES = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the card value
     */
    public int getValue() {
        return value;
    }
    
    /**
     * @param value the value of the card 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
