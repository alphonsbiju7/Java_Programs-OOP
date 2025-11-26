// Input n and print the first n Fibonacci numbers using a for loop. 
import java.util.Scanner;
public class fibonacciFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Limit:");
        int limit = sc.nextInt();
        int a =0,b=1,temp;
       for(int i = 0; i <limit; i++) {
        System.out.print(a +" ");
        temp = a;
        a = b;
        b = temp + b;
       }
       sc.close();
        
    }
    
}
