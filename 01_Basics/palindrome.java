//Input an integer and check if it's a palindrome (reads same forward and backward) using a while loop.
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int originalNumber = n;
        int reversedNumber = 0;
        
        while (n > 0) {
            int rem = n % 10; 
            reversedNumber = reversedNumber * 10 + rem;
            n = n/ 10; 
        }
        
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        
        sc.close();
    }

    
}
