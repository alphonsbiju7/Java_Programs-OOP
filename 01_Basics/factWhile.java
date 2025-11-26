// Write a Java program to print the factorial of a given number using a while loop.
import java.util.Scanner;

public class factWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        int i = n;
        int fact = 1;

        while (i >= 1) {
            fact = fact * i;
            i--;
        }

        System.out.println("Factorial is: " + fact);
        sc.close();

    }
}
