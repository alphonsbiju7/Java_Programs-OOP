//Input n numbers and calculate the sum and average of the elements in the array.
import java.util.Scanner;

public class SumAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum = sum+arr[i];
        }

        double average = (double)sum / n;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
        sc.close();
    }
}
