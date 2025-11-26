import java.util.Scanner;
class BankAccount{
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accNum, String accHolderName, double bal) {
        accountNumber = accNum;
        accountHolderName = accHolderName;
        balance = bal;
    }

    void depositAmount(double amount){
        if(amount>0){
            balance = balance+amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("New Updated Balance: " + balance);
        }
            else{
                System.out.println("Deposit amount not to be Zero.");
            }

    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String accHolderName = sc.nextLine();
        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, accHolderName, initialBalance);
        account.displayAccountDetails();

        System.out.println("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();
        account.depositAmount(amount);

        sc.close();
    }

}
