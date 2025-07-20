//Write a Java program to check whether a given number is prime using if-else statements and a for loop.

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i,flag=0;

        if (n <= 1) {
            System.out.println(n + " is not a prime number!");
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag=1;
                    break;  
                }
            }
            if (flag==0) {
                System.out.println(n + " is a prime number!");
            } else {
                System.out.println(n + " is not a prime number!");
            }
        }
        sc.close();
    }
}
