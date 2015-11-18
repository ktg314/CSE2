// Ken Grenestedt
// ktg314
// lab12

// 11/13/15

public class Manipulate
{   //open class
    
    public static int[][] raggedArray()
    {
        int width = (int) (Math.random()*11)+10;
        int[][] rArray = new int[width][];
        int height = 0;
        for (int i=0; i<width; i++)
        {
            height = (int) (Math.random()*11)+10;
            rArray[i] = new int[height];
            for (int j=0; j<rArray[i].length; j++)
            {
                rArray[i][j] = (int) (Math.random()*2001)-1000;
            }
        }
        return rArray;
    }
    
    public static void printArray(int[][] array)
    {
        for (int i=0; i<array.length; i++)
        {
            System.out.print("Member "+i+": ");
            for (int j=0; j<array[i].length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static void printArray(int[] array)
    {
        
        System.out.print("Contents of Array: ");
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
    
    public static int[] findSmallest(int[][] array)
    {
        int minVal = 50;
        int minRow = 0;
        for (int i=0; i<array.length; i++)
        {
            if (array[i].length < minVal)
            {
                minVal = array[i].length;
                minRow = i;
            }
        }
        
        int[] output = new int[array[minRow].length];
        for (int i=0; i<output.length; i++)
        {
            output[i] = array[minRow][i];
        }
        System.out.println("Smallest Member Array: "+minRow);
        return output;
    }
    
    public static int[] findLargest(int[][] array)
    {
        int maxVal = -1000;
        int maxRow = 0;
        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length; j++)
            {
                if (array[i][j] > maxVal)
                {
                    maxVal = array[i][j];
                    maxRow = i;
                }
            }
        }
        System.out.println("The largest number is: "+maxVal+". Found in member array #"+maxRow);
        int[] output = new int[array[maxRow].length];
        for (int i=0; i<output.length; i++)
        {
            output[i] = array[maxRow][i];
        }
        return output;
    }
    
    public static int[] mostEven(int[][] array)
    {
        int maxEvens = 0;   //max number of evens
        int maxRowIndex = 0;
        int nEvens = 0;     //number of evens
        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length; j++)
            {
                if (array[i][j]%2 == 0)
                {
                    nEvens++;
                }
            }
            if (nEvens > maxEvens)
            {
                nEvens = maxEvens;
                maxRowIndex = i;
            }
        }
        int[] output = new int[array[maxRowIndex].length];
        for (int i=0; i<output.length; i++)
        {
            output[i] = array[maxRowIndex][i];
        }
        System.out.println("The Most Even Array: "+maxRowIndex);
        return output;
    }
    
    public static void main(String[] args)
    {
        int[][] array = raggedArray();
        printArray(array);
        
        int[] smallest = findSmallest(array);
        printArray(smallest);
        
        int[] largest = findLargest(array);
        printArray(largest);
        
        int[] evens = mostEven(array);
        printArray(evens);
    }
    
    
}   //close class