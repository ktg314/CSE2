// Ken Grenestedt 
// ktg314
// HW06 Part1

// due 6 October 2015

// BarGraph.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class BarGraph {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        String[] WeekDays = {
            "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday",
            "Sunday"
        };
        double[] DailyCost = {
            0, 0, 0, 0, 0, 0, 0,
        };
        double[] rDailyCost = {
            0, 0, 0, 0, 0, 0, 0,
        }; //rounded daily value
        int n = 0;
        while (n<7) {
            try {
                System.out.print("Expenses for "+WeekDays[n]+": $");
                DailyCost[n] = myScanner.nextDouble();
                rDailyCost[n] = Math.round(DailyCost[n]);
                if (DailyCost[n] < 0) {
                    System.out.print("Please only enter positive numbers. Try again: $");
                    DailyCost[n] = myScanner.nextDouble();
                }
                n +=1;
            }
            catch (InputMismatchException e) {
                    System.out.println("Sorry, you did not enter an integer. Try again: $");
                    myScanner.nextLine();
            }
        }
        System.out.println("");
        
        String[] abbreviation = {
            "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"
        };
        int m;  //just define for loop
        for (n=0; n<7; n++) {
            System.out.print(abbreviation[n]+":    ");
            for (m=0; m < rDailyCost[n]; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        double avWeek = 0; //average spending per week
        double avDay = 0;  //average per day for the first week
        double totalYear = 0;   //expected spending after 4 years
        
        for (n=0; n<7; n++) {
            avWeek += DailyCost[n];
        }
        avDay = avWeek / 7;
        avDay = Math.round(avDay*100);
        avDay /= 100;
        
        System.out.println("Your average daily expenses are: $"+avDay);
        
        double fluctuation = 0;
        for (n=0; n<208; n++) { //208 is 52weeks per year * 4 years
            fluctuation = (int) (Math.random()*40+80);  //between 80 & 120
            fluctuation /= 100; //made to .8 to 1.2 or 80% to 120%.
            avWeek *= fluctuation;
            totalYear += avWeek;
        }
        totalYear = Math.round(totalYear*100);
        totalYear /= 100;
        System.out.println("Estimated expenditure for 4 years: $"+totalYear);
    }
}