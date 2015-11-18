// Ken Grenestedt
// ktg314
// hw12

// 11/13/15 due 11/17/15

import java.util.Scanner;

public class Transpose
{   //class
    
    public static int[][] randomMatrix(int width, int height)
    {
        int[][] array = new int[width][height];
        for (int i=0; i<height; i++)
        {
            for (int j=0; j<width; j++)
            {
                array[j][i] = (int) (Math.random()*21)-10;
            }
        }
        return array;
    }
    
    public static void printMatrix(int[][] array)
    {
        int width = array.length;
        int height = array[0].length;
        for (int i=0; i<width; i++)
        {
            if (height != array[i].length)
            {
                System.out.println("Matrix is not rectangular");
                break;
            }
        }
        
        //PRINT SHIT LATER//
        for (int i=0; i<height; i++)
        {
            System.out.print("| ");
            for (int j=0; j<width; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println("|");
            
        }
        
    }
    
    public static int[][] transposeMatrix(int[][] array)
    {
        //new width/height of output
        int width = array[0].length;
        int height = array.length;
        System.out.println("Width: "+width+" height: "+height);
        int[][] output = new int [width][height];
        for (int i=0; i<height; i++)
        {
            for (int j=0; j<width; j++)
            {
                output[j][i] = array[i][j];
            }
        }
        return output;
    }
    
    public static void main(String args[])
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter non-zero, positive integers for height & width");
        int height = 0;
        int width = 0;
        while (true)
        {
            System.out.print("  Height: ");
            if (myScanner.hasNextInt())
            {
                height = myScanner.nextInt();
            }
            if (height < 0)
            {
                System.out.println("ERROR: You entered a negative number.");
                height = 0;
            }
            if (height > 0)
            {
                break;
            }
            else 
            {
                System.out.println("ERROR: You did not enter a valid int.");
            }
            System.out.println("Try again.");
            myScanner.next();
        }
        while (true)
        {
            System.out.print("  Width: ");
            if (myScanner.hasNextInt())
            {
                width = myScanner.nextInt();
            }
            if (width < 0)
            {
                System.out.println("ERROR: You entered a negative number.");
                width = 0;
            }
            if (width > 0)
            {
                break;
            }
            else 
            {
                System.out.println("ERROR: You did not enter a valid int.");
                System.out.println("Try again.");
            }
            myScanner.next();
        }
        int[][] array = randomMatrix(width, height);
        printMatrix(array);
        int[][] array2 = new int [array[0].length][array.length];
        array2 = transposeMatrix(array);
        printMatrix(array2);
        
        
    }   //end main
    
    
}   //class