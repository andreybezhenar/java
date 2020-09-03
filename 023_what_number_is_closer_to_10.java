// problem: check which of 2 numbers is closer to 10.
// decision:

import java.util.Scanner;

public class HireMe {
    
    public static void main (String[] args) {
        
        Scanner myKeyboard = new Scanner (System.in);
        int m;
        int n;
        
        do {
            
            System.out.println("Enter your first number: ");
             m = myKeyboard.nextInt();
             System.out.println("Enter your second number: ");
             n = myKeyboard.nextInt();
             
             if (((m - 10) > (n - 10)) && (m > 0) && (n > 0)) {
                 System.out.println("Second number " + n + " is closer to 10");
             } 
             
             else {
                 System.out.println("First number " + m + " is closer to 10");
             }
             
        } while (((m - 10) > (n - 10)) && (m > 0) && (n > 0));
    }
}
