/*
Ken Grenestedt
ktg314
Lab 06
Oct 4 2015

Getting used to using loops
*/

public class GettingLoopy {
    public static void main(String[] args) {
        int counter = 1; 
        while (counter < 8) {
            System.out.print(counter++);
        }
        int Start7 = 0;
        int End7 = 4;
        while (Start7 < End7) {
            System.out.print("7");
            Start7++;
        }
        System.out.println("");
        
        int startNum = 10;
        int endNum = 100;
        int factor = 2;
        boolean prime = true;
        
        System.out.print("WHILE LOOP:");
        while (startNum < endNum) {     //start outer while loop
            while (factor < startNum) {
                if (startNum%factor == 0) {
                    prime = false;
                    factor = endNum;
                }
                else {
                    factor++;
                }
            }
            if (prime == true) {
                    System.out.print(startNum + " ");
            }
            factor = 2;
            prime = true;
            startNum++;
        }   //end outer while loop
        System.out.println("");
        
        System.out.print("FOR LOOP:");
        for (startNum = 10; startNum < endNum; startNum++) {
            for (factor = 2; factor < startNum; factor++) {
                if (startNum%factor == 0) {
                    prime = false;
                    factor = endNum;
                }
                else {
                    prime = true;
                }
            }
            if (prime == true) {
                    System.out.print(startNum + " ");
            }
        }
        System.out.println("");
        System.out.print("DO-WHILE LOOP:");
        factor = 2;
        prime = true;
        startNum = 10;
        do {     //start outer while loop
            do {
                if (startNum%factor == 0) {
                    prime = false;
                    factor = endNum;
                }
                else {
                    factor++;
                }
            } while (factor < startNum);
            if (prime == true) {
                    System.out.print(startNum + " ");
            }
            factor = 2;
            prime = true;
            startNum++;
        } while (startNum < endNum);   //end outer while loop
        
        System.out.println("");
        
        
        int smiley = (int) (Math.random()*196)+5;
        int i;
        int j;
        int rowsFull = (int) (smiley/20);
        int rowsPartial = smiley%20;
        for (i = 0; i < rowsFull; i++) {
            for (j=0; j<20; j++) {
                System.out.print("ツ");
            }
            System.out.println("");
        }
        for (i = 0; i < rowsPartial; i++) {
            System.out.print("ツ");
        }        
        
        System.out.println("");
        
    }   //end main method
}   //end class