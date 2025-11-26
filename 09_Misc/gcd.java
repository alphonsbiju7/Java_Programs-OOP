//// Write a Java program to find the greatest common divisor (GCD) of two numbers using a while loop.
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int n1 = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int n2 = sc.nextInt();
        int temp;

        while (n2!=0) {
            temp = n2;
            n2 = n1%n2;
            n1 = temp;
            
        }
        System.out.println("GCD is: " + n1);
        sc.close();
    }
    
}
