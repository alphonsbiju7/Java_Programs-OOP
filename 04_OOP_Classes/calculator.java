import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Enter the First No:");
        double number1 = sc.nextDouble();
        System.out.println("Enter the Second No:");
        double number2 = sc.nextDouble();
        System.out.println("Enter the Operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;  
            case '/':
                if (number2 != 0) {
                    System.out.println("Result: " + (number1 / number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
                
        }
        sc.close();

    }
    
}
