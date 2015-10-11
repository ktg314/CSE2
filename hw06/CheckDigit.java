// Ken Grenestedt
// ktg314
// HW06 part 2

// 6 October 2015

// CheckDigit.java

import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String ISBN = "123456789";  //random numbers, 9 of them so ISBN.lenght isn't 10.
        boolean bError = true;
        int j = 0;  //variable for determining if all values are integers.
        int n;
        char[] arrayISBN;
        
        do {
            System.out.print("Please enter a 10 digit barcode: ");
            ISBN = myScanner.next();
            arrayISBN = ISBN.toCharArray();
            if (ISBN.length() == 10) {
                for (n=0; n<9; n++) {
                    if (arrayISBN[n]=='1'||arrayISBN[n]=='2'||arrayISBN[n]=='3'
                    ||arrayISBN[n]=='4'||arrayISBN[n]=='5'||arrayISBN[n]=='6'
                    ||arrayISBN[n]=='7'||arrayISBN[n]=='8'||arrayISBN[n]=='9'
                    ||arrayISBN[n]=='0') {
                        j += 1;
                    }
                }
                if (arrayISBN[9]=='1'||arrayISBN[9]=='2'||arrayISBN[9]=='3'
                    ||arrayISBN[9]=='4'||arrayISBN[9]=='5'||arrayISBN[9]=='6'
                    ||arrayISBN[9]=='7'||arrayISBN[9]=='8'||arrayISBN[9]=='9'
                    ||arrayISBN[9]=='X'||arrayISBN[9]=='x'||arrayISBN[n]=='0') {
                    j += 1;
                }
                if (j == 10) {
                    bError = false;
                    continue; 
                }
                else {
                    j = 0;
                }
            }
            else {
            System.out.print("This is NOT a Valid ISBN. ");
            }
        } while (bError);
        
        int Value[] = new int[10];
        for (n=0; n<9; n++) {
            Value[n] = Character.getNumericValue(arrayISBN[n]);
        }
        int Sum = 0;
        int multiplier = 10;
        for (n=0; n<9; n++) {
            Sum += Value[n]*multiplier--;
        }
        
        if (arrayISBN[9]=='X'||arrayISBN[9]=='x') {
            Value[9] = 10;
        } 
        else {
            Value[9] = Character.getNumericValue(arrayISBN[9]);
        }

        if (Sum%11 == Value[9]) {
            System.out.println("This is a valid ISBN");
            return;
        }
        if (Sum%11 == 10) {
            System.out.println("This is NOT a valid ISBN. Check digit should be X");
            return;
        }
        else {
            System.out.println("This is NOT a valid ISBN. Check digit should be "
            + Sum%11);
        }
        return;
    }
}