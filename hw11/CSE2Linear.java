// Ken Grenestedt
// ktg314 
// hw11

// 10 November 2015

import java.util.Scanner;

public class CSE2Linear
{   //open class
    public static void main(String [] args)
    {   //open main
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter 15 ints (separated by spaces) for final grades in CSE2: ");
        String AllGrades = myScanner.nextLine();
        String[] splited = AllGrades.split("\\s+");
        int test[] = new int[splited.length];
        for (int i=0; i < splited.length; i++) 
        {
            try 
            {
                test[i] = Integer.parseInt(splited[i]);
                if (test[i] > 100 || test[i] < 0)
                {
                    System.out.println("Error: Score it out of range (0-100)");
                    System.out.println("    Program exiting");
                    return;
                }
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Error: One of the inputs was not an int");
                System.out.println("    Program exiting");
                return;
            }
        }
        if (test.length != 15)
        {
            System.out.println("Error: You didn't enter 15 ints");
            System.out.println("    Program exiting");
            return;
        }
        
        //Sort from smallest to biggest
        int sorted[] = new int[15];
        int min = 100;
        int IndexMin = 0;
        for (int i=0; i<15; i++)
        {
            min = 100;
            for (int j=0; j<test.length; j++) 
            {
                if (test[j] < min)
                {
                    min = test[j];
                    IndexMin = j;  
                }
                
            }
            sorted[i] = min;
            for (int n=IndexMin; n<test.length-1; n++)
            {
                test[n] = test[n+1]; 
            }
            test[14-i] = 100;
        }
        
        
        System.out.println("Sorted:");
        for (int i=0; i<15; i++)
        {
            System.out.print(sorted[i]+" ");
        }
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        int search = myScanner.nextInt();
        
        //Binary Search
        boolean matching = false;
        int maxArray = 14;   //top of the index/array thing
        int middle = 0; //index for middle value
        int minArray = 0;   //bottom of the index of the array
        int value = 0;
        int iterations = 1;
        
        while (!matching)
        {
            if (search == sorted[maxArray] || search == sorted[minArray])
            {
                matching = true;
                continue;
            } 
            
            middle = (int) ((maxArray + minArray)/2 + 1);
            value = sorted[middle];
            if (value == search)
            {
                matching = true;
                continue;
            }
            if (value > search)
            {
                if (maxArray == middle + 1)
                {
                    break;
                }
                else 
                {
                    maxArray = middle - 1;
                }
            }
            if (value < search)
            {
                if (minArray == middle - 1)
                {
                    break;
                }
                else 
                {
                    minArray = middle + 1;
                }
            }
            if (iterations == 4)
            {
                break;
            }
            iterations++;
        }
        //Binary search results.
        if (matching == true)
        {
            System.out.println(search+" was found in the list with "+iterations+" iterations");
        }
        else if (matching == false)
        {
            System.out.println(search+" was not found in the list with "+iterations+" iterations");
        }
        
        
        //Randomizer!!!
        int holder1 = 0;
        int holder2 = 0;
        int random1, random2;
        for (int i=0; i<30; i++)
        {
            random1 = (int) (Math.random()*15);
            holder1 = sorted[random1];
            random2 = (int) (Math.random()*15);
            holder2 = sorted[random2];
            sorted[random1] = holder2;
            sorted[random2] = holder1;
        }
        
        System.out.println("Scrambled:");
        for (int i=0; i<15; i++)
        {
            System.out.print(sorted[i]+" ");
        }
        
        iterations = 1; //reset
        matching = false;
        System.out.println();
        System.out.print("Enter a grade to search for: ");
        search = myScanner.nextInt();
        for (int i=0; i<sorted.length; i++)
        {
            if (search == sorted[i])
            {
                matching = true;
                break;
            }
            iterations++;
        }
        
        if (matching == true)
        {
            System.out.println(search+" was found in the list with "+iterations+" iterations");
        }
        else if (matching == false)
        {
            System.out.println(search+" was not found in the list with "+iterations+" iterations");
        }
        
        
    }   //close main
}   //close class