//tut-9 (5)
import java.util.Scanner;

public class replaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        
        System.out.print("Enter the character to replace: ");
        char oldChar = sc.next().charAt(0);
        
        
        System.out.print("Enter the replacement character: ");
        char newChar = sc.next().charAt(0);
        
        
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == oldChar) {
                result += newChar;
            } else {
                result += ch;
            }
        }
        
        System.out.println("Resulting string: " + result);
        sc.close();
    }
}
