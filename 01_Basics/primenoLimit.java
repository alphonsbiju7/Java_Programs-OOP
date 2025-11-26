// Write a Java program to print all even numbers between 1 and 100 using a for loop.
public class primenoLimit {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        int i,num;

        for (num = 2; num <= 100; num++) {
            int isPrime = 1;

            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = 0; 
                    break;
                }
            }

            if (isPrime==1) {
                System.out.print(num + " ");
            }
        }
    }
}
