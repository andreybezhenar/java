// problem: check if user's word (5 letters) is palindrom or not.
// decision:

import java.util.Scanner;

public class HireMe {
    
    public static void main (String[] args) {
    
        // let's get user's word:
        
        Scanner myKeyboard = new Scanner (System.in);
        int size = 0;
        
        do {
            
        System.out.println ("What is your word today? It should be 5 letters word only!");
        String usersWord = myKeyboard.next().toLowerCase();;
        size = usersWord.length();
    
        if (size != 5) { 
            System.out.println("Error!");
        }
        
        if (size == 5) {
             if (usersWord.charAt (0) == usersWord.charAt (4) && usersWord.charAt (1) == usersWord.charAt (3) ) {
                System.out.println("This word is palindrome!");
                } else {System.out.println("This word is not palindrome!");
             }
        }
        
        } while (size != 5);
        
    }
}

/* to remember:

1. declare variable of loop before loop. otherwise it won't work.
не обявляй тип переменной, которая уже объявлена, при присвоение значения! 

2. мы не можем работать с переменными из цикла (объявленные в теле циула) за переделами цикла.
поэтому все действи лучше провести в рамках цикла
*/
