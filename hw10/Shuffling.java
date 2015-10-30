// Ken Grenestedt
// ktg314
// hw10

// started 30 October
// due     3 November

public class Shuffling
{
    public static void printArray(String[] string)
    {
        for (int i=0; i<string.length; i++)
        {
            System.out.print(string[i]+" ");
        }
        System.out.println();
    }   //printArray method
    
    public static String[] shuffle(String[] cards)
    {
        int k;
        String temp;
        for (int i=0; i < 50; i++)
        {
            k = (int) (Math.random()*51+1);
            temp = cards[0];
            cards[0] = cards[k];
            cards[k] = temp; 
        }
        return cards;
    }
    
    public static String[] randomizeHand(String[] cards)
    {
        int k=0;
        String[] hand = {"F", "F", "F", "F", "F"};
        String test;
        for (int i=0; i<5; i++)
        {
            k = (int) (Math.random()*51+1);
            test = cards[k];
            if (test!=hand[1] || test!=hand[2] || test!=hand[3] || test!=hand[4] || test!=hand[5])
            {
                hand[i] = test;
            }
            else 
            {
                i--;
            }
            
        }
        return hand;
    }
    
    public static void main(String[] args) 
    {
        //Scanner scan = new Scanner(System.in);
    	//suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++)
        {
            cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        printArray(cards);
        cards = shuffle(cards);
        System.out.println("Shuffled");
        printArray(cards);
        hand = randomizeHand(cards);
        System.out.println("Randomized Hand!");
        printArray(hand);
    }   //end main method
}   //end class