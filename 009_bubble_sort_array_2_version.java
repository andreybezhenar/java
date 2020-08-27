// problem: implement a bubble sort algorithm to sort an array.
// decision 2: (using boolean flag)

import java.util.Arrays;

public class BubleSort {
    
    public static void main(String[] args) {
        
        int[] array = {8, 2, 4, 6};
        
        System.out.println("Unsorted: " + Arrays.toString(array));
        
        // set our boolean flag.
        boolean isSorted = false;
    
        
        // do this till we have our array sorted (i.e till boolen sorted got true).
        while (isSorted == false) {
            
            // when we don't go inside IF again bcs array is sorted, we will have "true" for sorted 
            isSorted = true;
            
            // condition (i < array.length – 1) to not go outside the array. 
            for (int i = 0; i < array.length - 1; i++) {
                
                if (array [i] > array [i + 1]) {
                
                     // we create buffer variable to swap the values.
                     int buf = array [i];
                     array [i] = array [i + 1];
                     array [i + 1] = buf;
                }
            }
            
        }
        
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}

/*
to remember:
1. for boolean isSorted = false: (!isSorted) same as (isSorted == false)
loop WHILe worls as long as condition in () is true.
т.е. мы ставим !, чтобы цикл выполнялся, пока значение которое есть у boolean истинно.
*/
