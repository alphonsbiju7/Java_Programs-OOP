// Input a character and use a switch statement to determine if it's a vowel or a consonant. 

import java.util.Scanner;
public class LowerConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
        
            default:
                if ((ch >= 'a' && ch <= 'z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not a valid lowercase letter.");
                }
        }
        sc.close();
    }
    
}
