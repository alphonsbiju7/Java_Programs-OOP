// Input n numbers and store them in an array. Then display the array elements in the same order and in reverse order.
import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array in original order: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nArray in reverse order: ");
        for(int i=n-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
