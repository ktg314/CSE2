// Ken Grenestedt
// ktg314
// Lab07

// 9 October 2015

// encrypted_x.java

import java.util.Scanner;

public class encrypted_x 
{
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        int input = 0;
        boolean acceptable = false;
        System.out.print("Input an integer between 0 and 100: ");
        while (!acceptable) 
        { 
            if (myScanner.hasNextInt() )
            {
                input = myScanner.nextInt();
                if (input < 0 || input > 100)
                {
                    System.out.println("Error: You did not enter a value between 0 and 100.");
                    acceptable = false;
                }
                else 
                {  
                    acceptable = true;
                    continue;
                }
            }
            else 
            {
                System.out.println("Error: You did not insert an integer");
                
            }
            System.out.print("Input an integer: ");
            myScanner.next();
        }
        int i = 0;
        int n = 0;
        for (i=1; i < input+1; i++)
        {
            for (int j = 1; j < input+1; j++) 
            {
                if (j == i)
                {
                    System.out.print(" ");
                    continue;
                }
                if (j ==  (input+1-i))
                {
                    System.out.print(" ");
                    continue;
                }
                else 
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
        
        
    }
}