// Ken Grenestedt
// ktg314
// lab04

// starting 9/18/15

// Assignment: Use a random number generator to select a number from 1 to 52
// (inclusive).  Each number represents one card, and the suits are grouped:
// Cards 1-13 represent the diamonds, 14-26 represent the clubs, then hearts,
// then spades.  In all suits, card identities ascend in step with the card
// number: 14 is the ace of clubs, 15 is the 2 of clubs, and 26 is the king
// of clubs.

// // Sample Runs
// You picked the 6 of Clubs
// You picked the Jack of Hearts
// You picked the Ace of Spades
// You picked the 4 of Diamonds


public class CardGenerator {    //open class
    public static void main(String[] args) {    //open main method
        
        // random number generator
        int randomNumber = (int) (Math.random() * 52);
        
        // defining strings suit & cardIdentity for face cards and stuff
        String suit = "asdf"; //dummy value
        
        // number converted from 1-52 to between 1 and 13
        int nSimple = randomNumber;
            if (nSimple <= 13) {
                nSimple = randomNumber;
            }
            else {
                nSimple = randomNumber%13;
            }
        // converting int values into the string "cardIdentity" 
        String cardIdentity = String.valueOf(nSimple);
        
        /////Switch statement for face cards
        switch ( nSimple ) {
            //Aces
            case 1:
                cardIdentity = "Ace";
                break;
            //Jacks
            case 11:
                cardIdentity = "Jack";
                break;
            //Queens
            case 12:
                cardIdentity = "Queen";
                break;
            //Kings
            case 0:
                cardIdentity = "King";
                break;
        }
        
        //If-elseif statements for specific suits
        if (0 < randomNumber & randomNumber < 14) {
            suit = "Diamonds";
        }
        else if (14 <= randomNumber & randomNumber < 27) {
            suit = "Clubs";
        }
        else if (27 <= randomNumber & randomNumber < 40) {
            suit = "Hearts";
        }
        else if (40 <= randomNumber & randomNumber < 53) {
            suit = "Spades";
        }
    
        System.out.println("You picked a "+cardIdentity+" of "+suit);

    }   //close main method
}   //close class