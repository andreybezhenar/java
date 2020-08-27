// problem: create an array of 15 random integers from the segment [0; 9]. count how many even elements.
// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        int[] array = new int [15];
        
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*10);
            if (array[i] %2 == 0) {
                count++;
            }
        }
        
        System.out.println("Array of random integers: " + (Arrays.toString(array)));
        System.out.println("The number of even numbers: " + count);
    }
    
}

/* to remember:
1. Math.random() returns double. To convert it to int use (int) before. Example:
          array[i] = (int) (Math.random()*10);
          
as long as we have int[], this code without (int) in the beginning will give us an error.

*/
