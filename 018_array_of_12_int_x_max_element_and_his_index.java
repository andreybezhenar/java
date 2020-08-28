// problem: create an array of 12 random integers from [-15; 15].
// determine maximum element and his index.
// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's create and fill up our array:
        int[] array = new int [12];

        for (int i = 0; i < array.length; i ++) {
            array [i] = (int) (Math.random()*31 - 15);
        }
        
        // and print:
        System.out.println(Arrays.toString(array));
        
        // let's guess that the first element is the maximum:
        int max = array[0];
        int maxIndex = 0;
        
        //and then if we see a number greater, then update that to be the new maximum:
        
        for (int i = 0; i < array.length; i ++) {
            if (array [i] >= max) {
                max = array [i];
                maxIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("Maximum is: " + max);
        System.out.println("His index  is: " + maxIndex);
        
    }
}
