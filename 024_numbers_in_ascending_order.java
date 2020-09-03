// problem: users should enter 3 numbers. we put them in ascending order.
// decision:

import java.util.Scanner;

public class HireMe {
    
    public static void main (String[] args) {
        
        Scanner myKeyboard = new Scanner (System.in);
        int a;
        int b;
        int c;
        int buf;
        
        do {
            
            System.out.println("Enter your first number: ");
             a = myKeyboard.nextInt();
            System.out.println("Enter your second number: ");
             b = myKeyboard.nextInt();
            System.out.println("Enter your second third: ");
             c = myKeyboard.nextInt();
             
             if (a > 0 && b > 0 && c > 0) {
                 
                 if (a > b) {
                     buf = b;
                     b = a;
                     a = buf;
                 } else if (b > c) {
                     buf = c;
                     c = b;
                     b = buf;
                 } else {
                     System.out.println ("Numbers are already in ascending order!");
                 }
             }
                 
                 System.out.println (a + " " + b + " " + c);
                 
             
        } while ((a > 0 && b > 0 && c > 0) && (a > b && b > c));
    }
}
