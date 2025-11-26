
public class exception {
    public static void main(String[] args) {
        System.out.println("Program Started "); 
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program Ended ");

    }
}
