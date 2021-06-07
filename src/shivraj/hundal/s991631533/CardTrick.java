package shivraj.hundal.s991631533;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Shivraj Hundal
 * @date June 6, 2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        System.out.println("Welcome to Card Trick! In this game, a hand of 7 cards will be randomly generated. You must pick a card to guess if it is in the hand.");
        System.out.println("To pick a Suit, enter 0, 1, 2, or 3 for Hearts, Diamonds, Spades or Clubs respectively."
                + " To enter a value, enter a number from 1 - 13 with 1 being Ace and 13 being King");
        System.out.println("For example, to guess Ace of Spades, you would enter 2 1 as your choice.");
        System.out.println("\nPlease enter your guess!");
        
        Scanner input = new Scanner(System.in);
        int userSuit = input.nextInt();
        int userValue = input.nextInt();
        
        Card userCard = new Card(userSuit, userValue) {  
        };
        
        System.out.println("User suit: " + userCard.getSuit() + " value is " + userCard.getValue());
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
             magicHand[i] = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            System.out.print("Suit is: " + magicHand[i].getSuit() + " and value is: " + magicHand[i].getValue());
            System.out.println(" Face is: " + Card.FACES[magicHand[i].getValue() - 1]);
        }
        
        
        //this for loop checks to see if the userCard matches any of the cards
        //in the 7 drawn cards
        for (int i = 0; i < magicHand.length; i++) {
            if (userCard.getSuit().equals(magicHand[i].getSuit())) {
                if (userCard.getValue() == magicHand[i].getValue()) {
                    System.out.println("You WIN!");
                    break;
                }
            } else if (i == magicHand.length - 1) {
                    System.out.println("YOU LOSE!");
            } 
        } //this code has an issue where if duplicate cards are drawn
        //in the magicHand, it will not print if you lost.
    }
}
