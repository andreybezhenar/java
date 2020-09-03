// problem: user gives size of array hat greater than 3 and we create array.
// after we should create second array that made only of even elements of first array.

// decision:

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        // let's get user's number:
        
        Scanner myKeyboard = new Scanner (System.in);
        int userNumber;
        
        do {
        System.out.println("Put number of array. It should be nomber greather than 3!");
        userNumber = myKeyboard.nextInt();
        if (userNumber < 3) {
            System.out.println("Error!");}
        } while (userNumber < 3);
        
        // let's create array with custom size and random numbers from [0; userNumber]:
    
        int evenCounter = 0; // to see number of even numbers.
    
        int[] array = new int[userNumber];
        
        for (int i = 0; i < array.length; i ++) {
            
            array [i] = (int) (Math.random()*(userNumber - 0 + 1) + 0);
            if ((array [i] % 2 == 0) && (array [i] != 0)) {
                evenCounter ++;
            }
        }
        
        System.out.println("Array that we made: " + Arrays.toString(array));
        System.out.println("Number of even numbers: " + evenCounter);
        
        // let's create second array that made only of even elements of first array:
        
        int[] evenArray = new int[evenCounter];
        
        for (int i = 0, j = 0;  i < array.length; i ++) {
            if ((array [i] % 2 == 0) && (array [i] != 0)) {
                evenArray [j] = array [i];
                j ++;
            }
        }  
        
        System.out.println("Second array made of only even elements of first array : " + Arrays.toString(evenArray));
        
    }
}

/* to remember:

объяви переменную, в которую записываешь число пользователя до цикла. 
при присвоение значения от пользователя в теле цикла (!) не указывай тип переменной.

*/
