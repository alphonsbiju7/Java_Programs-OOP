//Input a four-digit number and calculate the sum of its digits using a while loop. 

import java.util.Scanner;
public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit Number:");
        int n = sc.nextInt();

        int sum =0;
        int temp =n;

        while(temp>0){
            int digit = temp % 10; 
            sum = sum+digit;         
            temp = temp/10;
        }
        System.out.println("Sum Of Digits Of " + n + " is: " + sum);
        sc.close();
    }
    
}
