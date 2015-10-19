// Ken Grenestedt
// ktg314
// Lab08

// Stats.java

import java.util.Scanner;

public class Stats
{
    public static double MeanFunction(double one, double two, double three, double four, double five)
    {
        return (one+two+three+four+five)/5;  
    }
    public static double MedianFunction(double one, double two, double three, double four, double five)
    {
        return three;
    }
    public static void Print(double median, double mean)
    {
        System.out.println("The median is: "+median);
        System.out.println("The mean is: "+mean);
    }
    public static void main(String[] args)
    {
        double median;
        double mean;
        Scanner myScanner = new Scanner(System.in);
        double one, two, three, four, five;
        one = two = three = four = five = 0;
        int n = 0;
        boolean bError = false;
        double lastNumber = 0;
        
        while (!bError)
        {
            if (n==0)
            {
                System.out.print("Please input a double: ");
                n++;
                continue;
            }
            if (n==1)
            {
                lastNumber = one = myScanner.nextDouble();
                n++;
                System.out.print("Please input next double (must be bigger than previous!): ");
            }
            if (n==2)
            {
                two = myScanner.nextDouble();
                if (two <= lastNumber)
                {
                    System.out.println("    Error! You didn't input a larger double.");
                }
                else 
                {
                    lastNumber = two;
                    n++;
                    System.out.print("Please input next double (must be bigger than previous!): ");
                }
            }
            if (n==3)
            {
                three = myScanner.nextDouble();
                if (three <= lastNumber)
                {
                    System.out.println("    Error! You didn't input a larger double.");
                }
                else 
                {
                    lastNumber = three;
                    n++;
                    System.out.print("Please input next double (must be bigger than previous!): ");
                }
            }
            if (n==4)
            {
                four = myScanner.nextDouble();
                if (four <= lastNumber)
                {
                    System.out.println("    Error! You didn't input a larger double.");
                }
                else 
                {
                    lastNumber = four;
                    n++;
                    System.out.print("Please input next double (must be bigger than previous!): ");
                }
            }
            if (n==5)
            {
                five = myScanner.nextDouble();
                if (five <= lastNumber)
                {
                    System.out.println("    Error! You didn't input a larger double.");
                }
                else 
                {
                    lastNumber = five;
                    bError = true;
                }
            }
            
            
        }
        
        median = MedianFunction(one, two, three, four, five);
        mean = MeanFunction(one, two, three, four, five);
        Print(median, mean);
    }
}