//Count the number of even and odd elements in the array of n integers entered by the user.
import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int even = 0, odd = 0;
        System.out.println("Enter " + n + " numbers:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
        sc.close();
    }
}
        
 