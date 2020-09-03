// problem: create two-dimensional array with 8 rows by 5 columns.
// fill it up with random numbers from  [10;99].

// decision:

import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        int a = 10;
        int b = 99;
        
        int[][] array = new int[8][5];
        
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 5; j ++) {
                array [i][j] = (int) (Math.random() * (b - a + 1) + 1);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println(" ");
        }
        
    }
}
