//Ken Grenestedt
//ktg314
//Timer.java
//hw03 part 1
//
//starting 9/9
//due 9/15
//
//
//Sample run 
// Enter the current time: 1700
// Enter the time that you will be eating dinner: 1900
// You have 2 hours and 0 minutes until dinner.

// Enter the current time: 1028
// Enter the time that you will be eating dinner: 1850
// You have 8 hours and 22 minutes until dinner.


import java.util.Scanner;

public class Timer {   //open class
    
    public static void main(String[] args) {    //open method
        
        Scanner myScanner;
        myScanner = new Scanner( System.in); //declaring scanner
        
        //ask for current time in form of ABCD (integer)
        System.out.print("Enter the current time: ");
        int timeCurrent = myScanner.nextInt();

        //ask for dinner time in form of WXYZ (integer)
        System.out.print("Enter the time that you will be eating dinner: ");
        int timeDinner = myScanner.nextInt();
        
        /////////Calculations
        //define variables
        int remainingHours,
            remainingMinutes,
            hoursCurrent,
            minutesCurrent,
            hoursDinner,
            minutesDinner;
        
        //get rid of 1000ths and 100ths place
        minutesCurrent = timeCurrent%100;
        //get remaing 10^3 and 10^4th numbers representing hours then divide by 100
        hoursCurrent = (timeCurrent - minutesCurrent)/100;
        
        //get rid of 1000ths and 100ths place
        minutesDinner = timeDinner%100;
        //get remaing 10^3 and 10^4th numbers representing hours then divide by 100
        hoursDinner = (timeDinner - minutesDinner)/100;
        
        
        //simple subtraction to get time difference until dinner
        remainingHours = hoursDinner - hoursCurrent;
        remainingMinutes = minutesDinner - minutesCurrent;
        
        //if minutes of current component is greater
        //than the minutes component of minutesDinner
        //as a negative time in minutes doesn't make any sense
        if (remainingMinutes < 0) {
            remainingHours--;
            remainingMinutes = remainingMinutes + 60; 
        }
        
        
        
        //Statement of time remaining
        System.out.println("You have "+remainingHours+" hours and "+remainingMinutes+" minutes until dinner");
        
                
    }   //close method
}   //close class