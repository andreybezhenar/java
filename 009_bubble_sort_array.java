// problem: implement a bubble sort algorithm to sort an array.
// decision: 

import java.util.Arrays;

public class BubleSort {
    
    public static void main(String[] args) {
        
        int[] array = {8, 2, 4, 6};
        
        System.out.println("Unsorted: " + Arrays.toString(array));
        
        // we make this counter to limit number of checks.
        for (int i = 0; i < array.length; i++) { 
            
            
            // we make this counter to compare two elements of array.
            for (int j = 0; j < array.length - i - 1; j++) { 
                
                
                if (array[j] > array[j + 1]){
                    
                    // we create buffer variable to swap the values.
                    int buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                    
                }
            }
        }
        
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
