// Sort the array elements in ascending order and display the sorted array.
import java.util.Scanner;
import java.util.Arrays;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sorted array in ascending order: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
