// problem: сreate an array of 4 random integers from [10; 99]
// determine whether the array is strictly increasing sequence.

// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's create and fill up our array:
        int[] array = new int [4];
        
        for (int i = 0; i < array.length; i ++) {
            array [i] = (int) (Math.random()*100);
        }
        
        // and print:
        System.out.println(Arrays.toString(array));
        
        // let's count how many times condition (array [i] < array [i + 1]) is true:
        int count = 0;
        
        for (int i = 0; i < array.length - 1; i ++) {
            if (array [i] < array [i + 1]) {
                count ++;
            }
        }
        
        if (count == 3) {
            System.out.println("We have strictly increasing sequence.");
        } else {
            System.out.println("We dont have strictly increasing sequence.");
        } 
        
    }
}
