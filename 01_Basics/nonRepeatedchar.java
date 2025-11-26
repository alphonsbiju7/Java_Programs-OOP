//tut-9 (3)
import java.util.Scanner;

public class nonRepeatedchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Count frequency of each character using array
        int[] freq = new int[256]; // For ASCII characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        // Step 2: Find first character with frequency 1
        char firstNonRepeat = ' ';
        for (int i = 0; i < input.length(); i++) {
            if (freq[input.charAt(i)] == 1) {
                firstNonRepeat = input.charAt(i);
                break;
            }
        }

        // Step 3: Print result
        if (firstNonRepeat == ' ') {
            System.out.println("None");
        } else {
            System.out.println("First non-repeated character: " + firstNonRepeat);
        }
        sc.close();
    }
}
