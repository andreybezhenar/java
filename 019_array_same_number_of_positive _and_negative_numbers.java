// problem: make array of 12 integers from [-10;10]
// it has to be filled up with same number of positive and negative numbers in random order.
// no zeroes.

// decision:

import java.util.Arrays;

public class HireMe {
    
    public static void main (String[] args) {
        
        int[] array = new int[12];
        int positive = 0; // counter for positive elements.
        int negative  = 0; // counter for negative elenes.
        
        // let's create and fill up our array:
        
        for (int i = 0; i < array.length; i ++) {
            
        array [i] = (int) (Math.random()*21 - 10);
        
        if (array[i] > 0) {positive ++;}
        if (array[i] < 0) {negative ++;}
        if (array[i] == 0) {array[i] = array[i] + 1;}
        
        System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        
    }
}
