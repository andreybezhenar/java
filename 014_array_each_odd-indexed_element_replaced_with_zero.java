// problem: create an array of 8 random integers from the segment [1; 10]. 
// replace each odd-indexed element with zero.

// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        int[] array = new int [8];
    
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*11);
            if (i %2 != 0) {
                array[i] = 0;
            }
        }
        
        System.out.println("Array of random integers where each odd-indexed element replaced with zero: "); 
        System.out.println(Arrays.toString(array));
        
    }
    
}
