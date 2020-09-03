// problem: ask user to put number that is size of array with random integers.
// compare the sum of elements of array on the left side and on the right side.

// decision:


import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class HireMe {
    
    public static void main (String[] args) {
        
        int n = 0; // size of array
        int leftSum = 0; // sum of left side
        int rightSum = 0; // sum of right side
        
        
        
        // let's ask user to put number as long as it less than 1 or odd one:
        
        System.out.println("What's size of array you want to have?");
        System.out.println();
        Scanner myKeyboard = new Scanner (System.in);
        
        if (myKeyboard.hasNextInt()) {
            
            do {
                n = myKeyboard.nextInt();
                if (n%2 != 0 || n<1) {
                    System.out.println("Wrong number! Please try again!");
                }
            } while (n%2 != 0 || n<1);
        }
        
        
        
        // ok. we got he number. let's create an array:
        
        int[] myArray = new int[n];
        
        for (int i = 0; i < myArray.length; i ++) {
            myArray[i] = (int)(Math.random()*11)-5;
            
            if (i<n/2) {
                leftSum += myArray[i]; // of the elements on the left side.
            } else {
                rightSum += myArray[i]; //of the elements on the right side.
            }
            
            // let's compare our sums on the last loop:
            if (i == n-1){
                     if (leftSum < rightSum) {
                         System.out.println();
                         System.out.print ("The sum of the elements on the right side of the array is greater.");
                     } else {
                         System.out.println();
                         System.out.print ("The sum of the elements on the left side of the array is greater.");
                 }
            }
        }
        
        
        System.out.println();
        System.out.println();
        
        System.out.println(Arrays.toString(myArray)); 
        
        System.out.println();
        System.out.println("Sum of left side: " + leftSum);
        System.out.println("Sum of right side: " + rightSum);
        
    }
}


/* to remember:

если ты обявил переменную, то присваивая ей новое значение не указывай тип,
иначе получишь ошибку. укажи только имя и новое значение.
напимер:
int n = 0; int n = myKeyboard.nextInt(); – выдаст ошибку.
int n = 0; n = myKeyboard.nextInt(); – будет работать корректно.

*/
