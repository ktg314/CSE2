// Ken Grenestedt
// ktg314
// lab11

// 6 November 2015

import java.util.Scanner;

public class Search
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int[] array1 = new int [5000];  //array1
        int[] array2 = new int [5000];  //array2
        
        //defining array1
        for (int i=0; i<array1.length; i++)
        {
            array1[i] = (int) (Math.random()*100001);
        }
        
        //Searching or min/max of array1
        int iMin = 0;
        int min = array1[0];
        int iMax = 0;
        int max = array1[0];
        for (int i=0; i<array1.length; i++)
        {
            if (array1[i] < min)
            {
                min = array1[i];
                iMin = i;
            }
            else if (array1[i] > max)
            {
                max = array1[i];
                iMax = i;
            }
        }
        
        System.out.println("The maximum of array1 is: "+array1[iMax]);
        System.out.println("The minimum of array1 is: "+array1[iMin]);
        
        int i = 0;
        int previous = 0;
        //defining array2
        while (i<5000) 
        {
            array2[i] = (int) (Math.random()*100001);
            if (array2[i] < previous)
            {
                continue;
            }
            previous = array2[i];
            i++;
        }
        
        System.out.println("The maximum of array2 is: "+array2[4999]);
        System.out.println("The minimum of array2 is: "+array2[0]);
        
        System.out.print("Enter an int: ");
        int search = -5;
        search = myScanner.nextInt();
        if (search <= 0)
        {
            System.out.println("Must be an int > 0");
            return;
        }
        
        
        //Binary Search
        boolean matching = false;
        int maxArray = 4999;   //top of the index/array thing
        int middle = 0; //index for middle value
        int minArray = 0;   //bottom of the index of the array
        int value = 0;
        
        while (!matching)
        {
            if (search == array2[maxArray] || search == array2[minArray])
            {
                matching = true;
                continue;
            }
            
            middle = (int) ((maxArray + minArray)/2 + 1);
            value = array2[middle];
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
            
             
        }
        
        if (matching == true)
        {
            System.out.println("Number been found!");
        }
        else if (matching == false)
        {
            System.out.println("Number not found!");
            System.out.println("Upper bound: "+array2[maxArray]);
            System.out.println("Lower bound: "+array2[minArray]);
        }
        
    }   //end main
}   //end class