// problem: create an array of all even numbers from 2 to 20.
// decision: 

import java.util.Arrays;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's calculate length of array:
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i%2 == 0) {
                count++;
            }
        }
        
        // let's create new array and fill it:
        int[] array = new int[count];
        array[0] = 2;
        
        // let's fill our array with numbers from 2 t0 20:
        for (int i = 0; i < array.length - 1; i ++) {
            array[i + 1] = array [i] + 2;
        }
        
        System.out.println("Our array of even number from 2 to 20: ");
        System.out.println(Arrays.toString(array));
        
    }
}

/* to remember:
1. pay attention to (i < array.length - 1);
without -1 it goes out of array limits.

2. it was possible to use second counter inside of our FOR loop. 
that means we could fill up array another way:

for (int i = 0, j = 2; i < array.length; i ++) {
            array[i] = i + j;
            j ++;
        }

3. decision from the author:
for (int i = 2, j = 0; i <= 20; i ++) {
            if (i%2 == 0) {
            array[j] = i;
            j ++;
        }
}
        
*/
