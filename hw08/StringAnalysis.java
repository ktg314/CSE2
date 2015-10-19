// Ken Grenestedt
// ktg314
// HW08 part 2

// due 10/20/2015

import java.util.Scanner;

public class StringAnalysis
{   //open class
    public static void main(String[] args)
    {   //open main method
        Scanner myScanner = new Scanner(System.in); //define scanner
            //define variables
        boolean bError = false;
        boolean cError = false;
        String string = "";
        String option = "";
        int k = 0;
        int j = 0;
        
        System.out.print("String Analyzer: ");
        while (!bError) //loop for string that is analyzed
        {
            string = myScanner.nextLine();
            k = string.length();
            System.out.println("Which analyzation option would you like?");
            System.out.println("    Option 'a' : Analyze all characters.");
            System.out.println("    Option 'b' : Analyze specific number of characters.");
            while (!cError) //loop for ensuring a or b as input
            {
                option = myScanner.nextLine();
                if (option.equals("a"))
                {
                    bError = Analyzer(string);
                    cError = true;
                    continue;
                }
                else if (option.equals("b"))
                {
                    System.out.print("Enter number of characters you want analyzed: ");
                    j = myScanner.nextInt();
                    if (j > k)
                    {
                        j = k;
                    }
                    bError = Analyzer(string, j);   
                    cError = true;
                    continue;
                }
                else 
                {
                    System.out.println("ERROR! Please type 'a' or 'b' ");
                }
            }
            if (bError) //valid string
            {
                System.out.println("    Cheers! Valid Input!");
            }
            else if (!bError)   //invalid string
            {
                System.out.println("    Error! Invalid Input!");
                System.out.print("    Please input new string:");
                myScanner.next();
            }
        }
        
        
    }   //close main method
    
    public static boolean Analyzer(String string)   //option 'b'. String + # of chars
    {
        int n = 0;
        boolean test;
        int j = 0;
        int k = string.length();
        for (n=0; n<k; n++)
        {
            test = Character.isLetter(string.charAt(n));
            if (!test)
            {
                j = 1;
            }
        }
        if (j == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
    
    public static boolean Analyzer(String string, int var)  //option 'a'. Entire string.
    {
        int n = 0;
        boolean test;
        int j = 0;
        for (n=0; n<var; n++)
        {
            test = Character.isLetter(string.charAt(n));
            if (!test)
            {
                j = 1;
            }
        }
        if (j == 1)
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
    
}   //end class