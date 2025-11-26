//tut-6 (1)
import java.util.Scanner;

class employee {
    String name;
    String adresss;
    int age;
    int mob;
    float sal;

    void print_Salary() {
        System.out.println("Salary:"+ sal);
    }

}

class officer extends employee {
    String spl;

    void print_Specialization() {
        System.out.println("Specialization:" + spl);
    }
}

class manager extends employee {
    String dep;

    void print_Dept() {
        System.out.println("Department:"+dep);
    }
}

public class EmployeeInheri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        officer off = new officer();
        manager man = new manager();
        System.out.println("Enter Officer Details:");
        System.out.print("Name: ");
        off.name = sc.nextLine();
        System.out.print("Address: ");
        off.adresss = sc.nextLine();
        System.out.print("Age: ");
        off.age = sc.nextInt();
        System.out.print("Mobile Number: ");
        off.mob = sc.nextInt();
        System.out.print("Salary: ");
        off.sal = sc.nextFloat();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        off.spl = sc.nextLine();

        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        man.name = sc.nextLine();
        System.out.print("Address: ");
        man.adresss = sc.nextLine();
        System.out.print("Age: ");
        man.age = sc.nextInt();
        System.out.print("Mobile Number: ");
        man.mob = sc.nextInt();
        System.out.print("Salary: ");
        man.sal = sc.nextFloat();
        sc.nextLine(); 
        System.out.print("Department: ");
        man.dep = sc.nextLine();

        System.out.println("\nOfficer Details:");
        System.out.println("Name: " + off.name);
        System.out.println("Address: " + off.adresss);
        System.out.println("Age: " + off.age);
        System.out.println("Mobile Number: " + off.mob);
        off.print_Salary();
        off.print_Specialization();

        System.out.println("\nManager Details:");
        System.out.println("Name: "+man.name);
        System.out.println("Address: "+man.adresss);
        System.out.println("Age: "+man.age);
        System.out.println("Mobile Number: "+man.mob);
        man.print_Salary();
        man.print_Dept();

        sc.close();
    }
}

