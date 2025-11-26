class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
public class test {
    public static void main(String[] args) {
        int number = 4; // Example number to check
        if (Prime.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}