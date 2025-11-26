//// Write a Java program to check whether a given number is prime using if-else statements and a for loop.
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0; // To track if n is divisible by any number

        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            System.out.println(n + " is not a prime number!");
        } else {
            // Check divisibility from 2 to n/2
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1; // Found a factor
                    break;
                }
            }

            // Print result based on flag
            if (flag == 0) {
                System.out.println(n + " is a prime number!");
            } else {
                System.out.println(n + " is not a prime number!");
            }
        }

        sc.close();
    }
}




