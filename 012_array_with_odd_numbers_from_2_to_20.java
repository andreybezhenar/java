// problem: create an array of all odd numbers from 2 to 20.
// decision: 

import java.util.Arrays;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's calculate length of array:
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i%2 != 0) {
                count++;
            }
        }
        
        // let's create new array and fill it:
        int[] array = new int[count];
        
        for (int i = 0, j = 3; i < array.length; i ++) {
            array[i] = i + j;
            j ++;
        }
        
        System.out.println("Our array of odd numbers from 2 to 20: ");
        System.out.println(Arrays.toString(array));
        
    }
}

/* to remember:

1. could be used also this code (but it looks longer):

        int[] array = new int[count];
        array[0] = 3;
        
        // let's fill our array with numbers from 2 t0 20:
        for (int i = 0; i < array.length - 1; i ++) {
            array[i + 1] = array [i] + 2;
            
 */
