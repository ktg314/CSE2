// Ken Grenestedt
// ktg314
// hw04

// started 9/18,
// due 9/22.

// Suppose you randomly drew five cards, each from a different shuffled deck.
// Implement a program that detects whether the five cards contain a pair, 
// two pair, or three of a kind. If none of these special hands exist, report
// that you have a “high card hand”.  Simulate the drawing of the cards with
// randomly assigned variables, and encode the card identities in the same 
// way that you did in Lab 4.  

// While you may use if statements and switch statements, you may not 
// use loops, methods, or other constructs that occur later in the class.

// note to self: different from normal poker as you can draw the same card
// potentially twice, can use the same generator multiple times. 

//import java.util.Scanner;       //temporary to test whether if/else statement works

public class PokerHandCheck {    //open class
    public static void main(String[] args) {    //open main method
        
        // random number generator for cards 1->5
        //math.random * (max - min + 1) + 1
        int card1 = (int) (Math.random() * 52) + 1;
        int card2 = (int) (Math.random() * 52) + 1;
        int card3 = (int) (Math.random() * 52) + 1;
        int card4 = (int) (Math.random() * 52) + 1;
        int card5 = (int) (Math.random() * 52) + 1;
        
        // defining strings suit & cardIdentity for face cards and stuff
        String suit1 = "a"; //dummy value
        String suit2 = "b"; //dummy value
        String suit3 = "c"; //dummy value
        String suit4 = "d"; //dummy value
        String suit5 = "e"; //dummy value
        
        // number converted from 1-52 to between 1 and 13
        int value1 = card1;
            if (value1 < 13) {
                value1 = card1;
            }
            else {
                value1 = card1%13;
            }
        int value2 = card2;
            if (value2 < 13) {
                value2 = card2;
            }
            else {
                value2 = card2%13;
            }
        int value3 = card3;
            if (value3 < 13) {
                value3 = card3;
            }
            else {
                value3 = card3%13;
            }
        int value4 = card4;
            if (value4 < 13) {
                value4 = card4;
            }
            else {
                value4 = card4%13;
            }
        int value5 = card5;
            if (value5 < 13) {
                value5 = card5;
            }
            else {
                value5 = card5%13;
            }
        
        // converting int values into the string "cardNameX" 
        String cardName1 = String.valueOf(value1);
        String cardName2 = String.valueOf(value2);
        String cardName3 = String.valueOf(value3);
        String cardName4 = String.valueOf(value4);
        String cardName5 = String.valueOf(value5);
        
        /////Switch statement for face cards
        switch ( value1 ) {
            //Aces
            case 1:
                cardName1 = "Ace";
                break;
            //Jacks
            case 11:
                cardName1 = "Jack";
                break;
            //Queens
            case 12:
                cardName1 = "Queen";
                break;
            //Kings
            case 0:
                cardName1 = "King";
                break;
        }
        // switch statement for card2
        switch ( value2 ) {
            //Aces
            case 1:
                cardName2 = "Ace";
                break;
            //Jacks
            case 11:
                cardName2 = "Jack";
                break;
            //Queens
            case 12:
                cardName2 = "Queen";
                break;
            //Kings
            case 0:
                cardName2 = "King";
                break;
        }
        // switch statement for card3
        switch ( value3 ) {
            //Aces
            case 1:
                cardName3 = "Ace";
                break;
            //Jacks
            case 11:
                cardName3 = "Jack";
                break;
            //Queens
            case 12:
                cardName3 = "Queen";
                break;
            //Kings
            case 0:
                cardName3 = "King";
                break;
        }
        // switch statement for card4
        switch ( value4 ) {
            //Aces
            case 1:
                cardName4 = "Ace";
                break;
            //Jacks
            case 11:
                cardName4 = "Jack";
                break;
            //Queens
            case 12:
                cardName4 = "Queen";
                break;
            //Kings
            case 0:
                cardName4 = "King";
                break;
        }
        // switch statement for card5
        switch ( value5 ) {
            //Aces
            case 1:
                cardName5 = "Ace";
                break;
            //Jacks
            case 11:
                cardName5 = "Jack";
                break;
            //Queens
            case 12:
                cardName5 = "Queen";
                break;
            //Kings
            case 0:
                cardName5 = "King";
                break;
        }
        
        
        //If-elseif statements for specific suits
        //suits for card1
        if (0 < card1 & card1 < 14) {
            suit1 = "Diamonds";
        }
        else if (14 <= card1 & card1 < 27) {
            suit1 = "Clubs";
        }
        else if (27 <= card1 & card1 < 40) {
            suit1 = "Hearts";
        }
        else if (40 <= card1 & card1 < 53) {
            suit1 = "Spades";
        }
        
        //suits for card2
        if (0 < card2 & card2 < 14) {
            suit2 = "Diamonds";
        }
        else if (14 <= card2 & card2 < 27) {
            suit2 = "Clubs";
        }
        else if (27 <= card2 & card2 < 40) {
            suit2 = "Hearts";
        }
        else if (40 <= card2 & card2 < 53) {
            suit2 = "Spades";
        }    
        
        //suits for card3
        if (0 < card3 & card3 < 14) {
            suit3 = "Diamonds";
        }
        else if (14 <= card3 & card3 < 27) {
            suit3 = "Clubs";
        }
        else if (27 <= card3 & card3 < 40) {
            suit3 = "Hearts";
        }
        else if (40 <= card3 & card3 < 53) {
            suit3 = "Spades";
        }
        
        //suits for card4
        if (0 < card4 & card4 < 14) {
            suit4 = "Diamonds";
        }
        else if (14 <= card4 & card4 < 27) {
            suit4 = "Clubs";
        }
        else if (27 <= card4 & card4 < 40) {
            suit4 = "Hearts";
        }
        else if (40 <= card4 & card4 < 53) {
            suit4 = "Spades";
        }
        
        //suits for card5
        if (0 < card5 & card5 < 14) {
            suit5 = "Diamonds";
        }
        else if (14 <= card5 & card5 < 27) {
            suit5 = "Clubs";
        }
        else if (27 <= card5 & card5 < 40) {
            suit5 = "Hearts";
        }
        else if (40 <= card5 & card5 < 53) {
            suit5 = "Spades";
        }
        
    
        System.out.println("Your random cards were:");
        System.out.println("    The "+cardName1+" of "+suit1);
        System.out.println("    The "+cardName2+" of "+suit2);
        System.out.println("    The "+cardName3+" of "+suit3);
        System.out.println("    The "+cardName4+" of "+suit4);
        System.out.println("    The "+cardName5+" of "+suit5);

        int pair = 0;   //for number of pairs
        //if 3 -> triple
        //if 2 -> 2 pair
        //if 1 -> pair
        
        //pairs containing card 1
        if (cardName1.equals(cardName2)) {
            pair += 1;
        }
        if (cardName1.equals(cardName3)) {
            pair += 1;
        }
        if (cardName1.equals(cardName4)) {
            pair += 1;
        }
        if (cardName1.equals(cardName5)) {
            pair += 1;
        }
        //pairs starting with card 2
        //23, 24, 25
        if (cardName2.equals(cardName3)) {
            pair += 1;
        }
        if (cardName2.equals(cardName4)) {
            pair += 1;
        }
        if (cardName2.equals(cardName5)) {
            pair += 1;
        }
        //pairs starting with card3
        //34, 35
        if (cardName3.equals(cardName4)) {
            pair += 1;
        }
        if (cardName3.equals(cardName5)) {
            pair += 1;
        }
        //pairs starting with card 4
        //45
         if (cardName4.equals(cardName5)) {
            pair += 1;
        }
    
        if (pair == 3) {
            System.out.println("You have three of a kind!");
        }
        else if (pair == 2) {
            System.out.println("You have a two pair!");
        }
        else if (pair == 1) {
            System.out.println("You have a pair!");
        }
        else {
            System.out.println("You have a high card hand!");
        }
        
    }   //close main method
}   //close class