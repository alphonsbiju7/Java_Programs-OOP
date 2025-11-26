// Take n as input and print odd numbers from 1 to n using a for loop and continue statement 
import java.util.Scanner;
public class oddPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.print(i + " ");
        }
        
        sc.close();
        
    }
    
}
