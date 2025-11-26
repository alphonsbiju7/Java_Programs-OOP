import java.util.Scanner;

class MyCalculator {
    double number1;
    double number2;

    MyCalculator(double n1, double n2) {
        number1 = n1;
        number2 = n2;
    }

    double add() {
        return number1 + number2;
    }

    double subtract() {
        return number1 - number2;
    }

    double multiply() {
        return number1 * number2;
    }

    double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Division by Zero Not Possible");
            return 0;
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            System.out.print("Enter the first number: ");
            double number1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double number2 = sc.nextDouble();

            MyCalculator c1 = new MyCalculator(number1, number2);

            switch (choice) {
                case 1:
                    System.out.println("Result: " + c1.add());
                    break;
                case 2:
                    System.out.println("Result: " + c1.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + c1.multiply());
                    break;
                case 4:
                    System.out.println("Result: " + c1.divide());
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to perform another operation? (Y/N): ");
            continueChoice = sc.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Calculator Exited! Thank you for using the calculator.");
        sc.close();
    }
}
