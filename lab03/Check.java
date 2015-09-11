//Ken Grenestedt
//ktg314
//lab03
//
//starting 9/11
//
//
//Assignment:
// The user has gone out to dinner with friends. After they receive the bill, 
//they decide to split the check evenly. Write a program that uses the Scanner 
//class to obtain from the user the original cost of the check, the percentage 
//tip they wish to pay, and the number of ways the check will be split. Then 
//determine how much each person in the group needs to spend in order to pay the check.


import java.util.Scanner;

public class Check {    //open main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner( System.in);    //declare scanner

        //ask for original cost
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        
        //ask for tip percentage
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        double tipPercent = myScanner.nextDouble();
        
        //convert from whole number into percentage (decimal value)
        tipPercent /= 100;
        
        //ask for number of people
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();

        //rounding values
        double totalCost;
        double costPerPerson;
        int dollars,   //whole dollar amount of cost 
             dimes, pennies;  //for storing digits
                              //to the right of the decimal point 
                              //for the cost$ 
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
            //get the whole amount, dropping decimal fraction
        dollars=(int)costPerPerson;
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(costPerPerson * 10) % 10;
        pennies=(int)(costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);



	} //end of class
}  //end of main method   
  


    