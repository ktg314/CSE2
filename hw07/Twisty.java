// Ken Grenestedt
// ktg314
// hw07

// Twisty.java

import java.util.Scanner;

public class Twisty
{
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        int input = 0;
        boolean acceptable = false;
        int length = 0;
        int width = 0;
        int k = 0; //variable for 1st and 2nd inputs
        
        while (!acceptable)
        {
            if (k==0)
            {
                System.out.print("Input your desired length: ");
            }
            else if (k==1)
            {
                System.out.print("Input your desired width: ");
            }
            if (myScanner.hasNextInt() )
            {
                input = myScanner.nextInt();
                if (input < 0 || input > 80)
                {
                    System.out.println("    Error: You did not enter a value between 0 and 80");
                    acceptable = false;
                }
                else 
                {
                    if (k==0)
                    {  
                        length = input;
                        k++;
                    }
                    else if (k==1)
                    {
                        width = input;
                        if (width > length)
                        {
                            System.out.println("    Error: Please input an integer smaller than the length: ");
                        }
                        else
                        {
                            acceptable = true;
                            continue;
                        }
                    }
                }
            }
            else 
            {
                System.out.println("    Error: You did not insert an integer");
                myScanner.next();
            }
        }
        
        
        String symbol = "";
        int r = (int) (length/width);        
        for (int n=1; n<width+1; n++)
        {
            for (int j=1; j<length+1; j++)
            {
                for (int var=0; var<r; var++)
                {
                    //upward "/"s
                    if (j == 2*width*var+width+1-n)
                    {
                        symbol = "/";
                    }
                    
                    //upwards "#"s
                    if (j == 2*width*var+2*width+1-n)
                    {
                        symbol = "#";
                    }
                    
                    //downward "#"s
                    else if (j == 2*width*var+n)
                    {
                        symbol = "#";   
                        //has priority over the upwards /s
                    }
                    
                    //downward "/"s
                    else if (j+width == 2*width*var+n)
                    {
                        symbol = "\\";
                        //has priority over the upwards #s
                    }
                }
                switch (symbol) 
                {
                    case "#":
                        System.out.print("#");
                        break;
                    case "/":
                        System.out.print("/");
                        break;
                    case "\\":
                        System.out.print("\\");
                        break;
                    default:
                        System.out.print(" ");
                }
                symbol = "asdf";
            }
            System.out.println("");
        }
        
        
        
    }
}