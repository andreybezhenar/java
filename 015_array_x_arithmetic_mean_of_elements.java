// problem: create 2 arrays of 5 random integers from the segment [0; 5] each.
// calculate the arithmetic mean of the elements of each array.
// report for which of the arrays this value turned out to be greater (or report that their arithmetic means are equal).

// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        
        double sum1 = 0;
        double sum2 = 0;
        
        for (int i = 0; i < 5; i ++) {
            
            array1[i] = (int) (Math.random()*4);
            array2[i] = (int) (Math.random()*4);
            
            sum1 += array1[i];
            sum2 += array2[i];
        }
        
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("The arithmetic mean of the elements of this array is: " + sum1/5);
        
        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("The arithmetic mean of the elements of this array is: " + sum2/5);
        
        System.out.println(" ");
        
        if (sum1/5 > sum2/5) {
            System.out.println("The arithmetic mean of the elements of the first array is greather than of second.");
        } else if (sum1/5 == sum2/5) {
            System.out.println("The arithmetic mean of the elements of the first array is equal to second.");
        } else {
                System.out.println("The arithmetic mean of the elements of the second  array is greather than of first.");
        }
        
    }
}
