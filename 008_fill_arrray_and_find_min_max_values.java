// problem: fill the array with random numbers and print the maximum, minimum and average values.
// decision: 

import java.util.Arrays;

public class MyTest {
    public static void main(String args[]) {
        
        int n = 100;
        double sum = 0;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            sum+=array[i];
        }
        
        // version 1: using imprort java.util.Arrays.
        Arrays.sort(array);
        System.out.println("My idea for max: " + array[n - 1]);
        System.out.println("My idea for min: " + array[0]);
        System.out.println("My idea for avg: " + sum/array.length);
        System.out.println();
        
        // version 2: using conditional statements:
        double max = array[0]; 
        double min = array[0];
        double avg = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg += array[i]/array.length;
        }
        
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        
    }
}
