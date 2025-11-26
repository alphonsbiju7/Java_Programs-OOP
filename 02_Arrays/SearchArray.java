// Search for a number in the array and print its position if found, or a message if not found.
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for(int i=0; i<n; i++) {
            if(arr[i] == key) {
                System.out.println(key + " found at position " + i + " (index starts from 0)");
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println(key + " not found in the array.");
        }
        sc.close();
    }
}
