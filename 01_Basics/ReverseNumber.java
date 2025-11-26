// Write a Java program to print the reverse of a given number using a for loop.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Reverse: ");
        int n = sc.nextInt();
        int rem,reverse=0;

        for(;n!=0; n=n/10){
            rem = n%10;
            reverse = reverse*10+rem;
        }
        System.err.println("Reversed Number is:" + reverse );
        sc.close();
    }
    
}