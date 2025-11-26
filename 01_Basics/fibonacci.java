// Write a Java program to print the Fibonacci series up to a given number using a while loop.
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Limit:");
        int limit = sc.nextInt();
        int a =0,b=1,temp;
       while(a<=limit){
        System.out.print(a +" ");
        temp = a;
        a = b;
        b = temp + b;
       }
       sc.close();
    }

    
}
