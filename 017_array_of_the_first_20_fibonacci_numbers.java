// problem: create an array of the first 20 Fibonacci numbers and display it.
// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's create and fill up our array:
        int[] array = new int [20];
        array [0] = 1;
        array [1] = 1;
        
        for (int i = 2; i < array.length; i ++) {
            array [i] = array [i - 1] + array [i - 2];
        }
        
        // and print:
        System.out.println("Sequence of Fibonacci numbers: ");
        System.out.println(Arrays.toString(array));
        
    }
}
