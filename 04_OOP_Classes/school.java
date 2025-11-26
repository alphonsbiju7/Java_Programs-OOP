// File: person.java inheritance example parent - child classes
import java.util.Scanner;

// Superclass (Base class)
public class school {
    String name;
    long  phoneNumber;

    // Method to display common info
    public void showAdress() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

// Subclass 1
class Teachers extends school {
    // Additional properties/methods can be added here
}

// Subclass 2
class Students extends school {
    // Additional properties/methods can be added here
}

// Subclass 3
class Staffs extends school {
    // Additional properties/methods can be added here
}

// Main class (not public, since file name is person.java)
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating object of Teachers class
        Teachers t1 = new Teachers();
        System.out.println("Enter Teacher's Name:");
        t1.name = sc.nextLine();
        System.out.println("Enter Teacher's Phone Number:");
        t1.phoneNumber = sc.nextLong();
        sc.nextLine(); // clear buffer

        Students s1 = new Students();
        System.out.println("Enter Student's Name:");
        s1.name = sc.nextLine();
        System.out.println("Enter Student's Phone Number:");
        s1.phoneNumber = sc.nextLong();
        sc.nextLine(); // clear buffer

        Staffs f1 = new Staffs();
        System.out.println("\nEnter Staff's Name:");
        f1.name = sc.nextLine();
        System.out.println("Enter Staff's Phone Number:");
        f1.phoneNumber = sc.nextLong();



        // Using inherited method
        System.out.println("\n----- Teacher Details -----");
        t1.showAdress();
        System.out.println("\n----- Student Details -----");
        s1.showAdress();
        System.out.println("\n----- Staff Details -----");
        f1.showAdress();
        sc.close();

    }
}
