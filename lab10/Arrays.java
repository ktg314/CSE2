// Ken Grenestedt
// ktg314
// Lab 10

// 30 October 2015

import java.util.Scanner;

public class Arrays
{
    public static void main(String []args)
    {
        Scanner myScanner = new Scanner (System.in);
        int nStudents = (int) (Math.random()*5+5);
        String[] student = new String [nStudents];
        System.out.println("Enter "+nStudents+" student names.");
        for (int i=0; i<nStudents; i++)
        {
            student[i] = myScanner.nextLine();
        }
        
        System.out.println();
        System.out.println("Here are the midterm grades of the "+nStudents+" students above");
    
        int[] midterm = new int [nStudents];
        for (int i=0; i<nStudents; i++)
        {
            midterm[i] = (int) (Math.random()*100);
        }
        for (int i=0; i<nStudents; i++) 
        {
            System.out.println(student[i]+" : "+midterm[i]);
        }
        
        
        
    }   //end main method
}   //end class