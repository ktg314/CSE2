// Ken Grenestedt
// ktg314
// HW08 part 2

// due 10/20/2015

import java.util.Scanner;

public class StringAnalysis
{   //open class
    public static void main(String[] args)
    {   //open main method
        Scanner myScanner = new Scanner(System.in);
        boolean bError = false;
        String string = "";
        int k = 0;
        
        while (!bError)
        {
            System.out.print("String Analyzer: ");
            string = myScanner.nextLine();
            k = string.length();
            bError = Analyzer(string, k);
            if (bError)
            {
                System.out.println("    Cheers! Valid Input!");
            }
            else if (!bError)
            {
                System.out.println("    Error! Invalid Input!");
                System.out.println("    Please input new string.");
            }
        }
        
        
    }   //close main method
    
    public static boolean Analyzer(String string)
    {
        return true;
    }
    
    public static boolean Analyzer(String string, int var)
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