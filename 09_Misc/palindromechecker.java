// tut-9 (2)
import java.util.Scanner;
public class palindromechecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String clean = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean += Character.toLowerCase(ch);
            }
        }
        boolean isPalindrome = true;
        int n = clean.length();
        for (int i = 0; i < n / 2; i++) {
            if (clean.charAt(i) != clean.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }
        sc.close();

    }
    
}
