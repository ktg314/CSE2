//Ken Grenestedt
//ktg314
//hw02

//Objectives:  This homework has the objective of giving you 
//practice manipulating data stored in variables, in running 
//simple calculations, and in printing the numerical output 
//that you generated.

//Task: You go shopping at Walmart’s and want to compute 
//the cost of the items you bought, including the PA sales 
//tax of 6%.  Begin by setting up a class called “Arithmetic” 
//with a main method, as you did in your first homework.


//  define a class
public class Arithmetic {
    
//  add main method
    public static void main(String[] args) {
        
        //Assumptions (input variables)
        /////////////SOCKS/////////////////
        //number of socks
        int nSocks=3;
        
        //Cost per pair of socks
            //('$' is part of the variable name)
        double sockCost$=2.58;

        //total sock cost
        double totalSockCost$;
        totalSockCost$ = nSocks * sockCost$;
        
        ////////////Envelopes/Box////////////
        //number of boxes of envelopes
        int nEnvelopes=1;
        
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //total envelope cost
        double totalBoxCost$;
        totalBoxCost$ = nEnvelopes * envelopeCost$;
        
        
        ////////////Glasses///////////////
        //number of drinking glasses
        int nGlass=6;
        
        //cost per glass
        double glassCost$=2.29;
        
        //total glass cost
        double totalGlassCost$;
        totalGlassCost$ = nGlass * glassCost$;
        
        
        //////Tax
        //total pre-tax cost
        double preTaxCost$;
        preTaxCost$ = totalSockCost$ + totalBoxCost$ + totalGlassCost$;
        
        //defining percentage tax
        double taxPercent=0.06;
        
        //total sales tax
        double salesTax;
        salesTax = preTaxCost$*taxPercent;
        
            //ROUNDING the sales tax//
            //rounding to 2 digits past integer
            
            //defining variables for whole numbers, 10ths, 100ths etc.
            int dollars,    //whole numbers
                dimes,      //10ths
                pennies,    //100ths
                subpennies; //1000ths
            
            dollars = (int) salesTax;                   //all the whole numbers before the decimal
            dimes = (int) ((salesTax*10)%10);           //the 10s place digit as an integer
            pennies = (int) ((salesTax*100)%10);        //the 100s place digit as an integer
            subpennies = (int) ((salesTax*1000)%10);    //the 1000s place digit as an integer
            
                //if-then-else statement for rounding
                
                
                //open if statement
                if (subpennies > 4) { 
                ++pennies;
                }   //close if statement
                //above rounds the number in the hundred's place 
                //up by 1 if the 1000ths place digit is 5 or greater
                
                //open else statement
                else {
                pennies = (int) ((salesTax*100)%10);
                }   //close else statement
                //else statement makes sure that nothing happens and
                //the 1000ths place digit is simply dropped if it 4 or less
                //and redefines the 100ths place digit just in case
                
        
        //rounded sales tax
        double roundedSalesTax;
       
        //cast integer dimes/pennies into doubles
        double ddimes = (double) (dimes);
        double ppennies = (double) pennies;
        
        //currently the variables hold the digits in the 10s and 100s place as integers,
        //this process turns them back into the decimal form
        roundedSalesTax = ddimes/10 + ppennies/100;
    
        
        //total post-tax cost
        double postTaxCost$;
        postTaxCost$ = preTaxCost$ + roundedSalesTax;
        
        
        
        ///////Statement
        
        System.out.println("You went to Walmart to buy some socks, glasses, and envelopes.");
        System.out.println("You bought "+nSocks+" socks, "+nGlass+" glasses and "+nEnvelopes+" envelope.");
        System.out.println("The socks cost $"+sockCost$+" each, the glasses cost $"+glassCost$+" each and the envelopes cost $"+envelopeCost$+" each.");
        System.out.println("The total cost of the socks was $"+totalSockCost$+" pre-tax.");
        System.out.println("The total cost of the glasses was $"+totalGlassCost$+" pre-tax.");
        System.out.println("The total cost of the envelopes was $"+totalBoxCost$+" pre-tax.");
        System.out.println("The total cost of all bought items was $"+preTaxCost$+" pre-tax.");
        System.out.println("Assuming a tax rate of "+(taxPercent*100)+"%, $"+dollars+"."+dimes+pennies+" was the total sales tax.");
        System.out.println("The total cost of the purchases (including sales tax) was then $"+postTaxCost$);
        
        
            
        
        
//  close main method    
    }
    
//  close class
}