// problem: show on the screen all prim number from 2 to 100.
// decision:

public class Prime {
    
    public static void main (String[] args) {
        
        for (int i = 2; i <= 100; i++ ) {
            
            boolean isPrime = true;
            
            for (int j = 2; j < i; j++) {
                // a prime is a natural number greater than 1 that is not a product of two smaller natural numbers.
                if (i % j == 0) { 
                    isPrime = false; 
                    break; // to keep j = 2 all the time and change only i.
                }
            }
                
            if (isPrime) {
                System.out.println(i);
            }
                
        
        }
    }
}

/*
to remember:
1. pay attention where is if (isPrime) {System.out.println(i);} should be.
*/
