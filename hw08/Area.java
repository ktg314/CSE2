// Ken Grenestedt
// ktg314
// HW08 part 1

// due 10/20/2015

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)  //main method
    {
        Scanner myScanner = new Scanner(System.in);
        boolean bError = false;
        String shape = "";
        int var=0;
        double area = 0;
        while (!bError)       //loop for figuring out which method to implemnt
        {
            System.out.print("For what shape would you like to calculate area? ");
            shape = myScanner.nextLine();
            var = checkInput(shape);
            if (var==1)
            {
                area = Rectangle();
                bError = true;
            }
            if (var==2)
            {
                area = Triangle();
                bError = true;
            }
            if (var==3)
            {
                area = Circle();
                bError = true;
            }
        }
        System.out.println("The area of the "+shape+" is "+area);
    }   //end main method
    
    public static int checkInput(String shape)  //check input method
    {
        if (shape.equals("rectangle"))
        {
            return 1;
        }
        if (shape.equals("triangle"))
        {
            return 2;
        }
        if (shape.equals("circle"))
        {
            return 3;
        }
        else 
        {
            System.out.println("    Error! That is not an acceptable shape. ");
            System.out.println("    You may choose from rectangle, triangle, and square.");
            return 0;
        }
    }
    
    public static double Rectangle()    //calculate area of a rectangle
    {
        Scanner myScanner = new Scanner(System.in);
        double width, height;
        width = height = 0;
        while (true)
        {
            System.out.print("Please enter width: ");
            if (myScanner.hasNextDouble())
            {
                width = myScanner.nextDouble();
                break;
            }
            else 
            {
                System.out.println("    Error! Please enter a double.");
                myScanner.next();
            }
        }
        while (true)
        {
            System.out.print("Please enter height: ");
            if (myScanner.hasNextDouble())
            {
                height = myScanner.nextDouble();
                break;
            }
            else 
            {
                System.out.println("    Error! Please enter a double.");
                myScanner.next();
            }
        }
        double area = width * height;
        return area;
    }
    
    public static double Triangle()     //calculate area of a triangle 
    {
        Scanner myScanner = new Scanner(System.in);
        double base, height;
        base = height = 0;
        while (true)
        {
            System.out.print("Please enter length of the base: ");
            if (myScanner.hasNextDouble())
            {
                base = myScanner.nextDouble();
                break;
            }
            else 
            {
                System.out.println("    Error! Please enter a double.");
                myScanner.next();
            }
        }
        while (true)
        {
            System.out.print("Please enter height: ");
            if (myScanner.hasNextDouble())
            {
                height = myScanner.nextDouble();
                break;
            }
            else 
            {
                System.out.println("    Error! Please enter a double.");
                myScanner.next();
            }
        }
        double area = base * height * 1/2;
        return area;
    }
    
    public static double Circle()       //calculate area of circle
    {
        Scanner myScanner = new Scanner(System.in);
        double radius = 0;
        while (true)
        {
            System.out.print("Please enter radius: ");
            if (myScanner.hasNextDouble())
            {
                radius = myScanner.nextDouble();
                break;
            }
            else 
            {
                System.out.println("    Error! Please enter a double.");
                myScanner.next();
            }
        }
        double pi = 3.14159;
        double area = radius * radius * pi;
        return area;
    }
}   //end class 