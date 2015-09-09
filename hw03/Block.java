//Ken Grenestedt
//ktg314
//Block.java
//hw03 part2
//
//starting 9/9 due 9/15
//
//
//Sample Run 
// Enter the length of the block: 5.2
// Enter the width of the block: 3.1
// Enter the height of the block: 9.8
// The volume of the block of dimensions 5.2 x 3.1 x 9.8 is 157.97600000000003. 
// The surface area of the block is 194.92000000000002.

import java.util.Scanner;   //import scanner

public class Block {   //open class
    
    public static void main(String[] args) {    //open method
        
        Scanner myScanner;
        myScanner = new Scanner( System.in); //declaring scanner
        
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //Calculations
        double volume,
            surfaceArea;
        
        volume = length * width * height;
        
        surfaceArea = (length * width * 2) + 
            (length * height * 2) +
            (width * height * 2);
        
        //statement of result
        System.out.println("The volume of the block of dimensions "+length+
        " x "+width+" x "+height+" is "+volume);
        System.out.println("The surface area of the block is "+surfaceArea);
        
    }   //close method
}   //close class
        