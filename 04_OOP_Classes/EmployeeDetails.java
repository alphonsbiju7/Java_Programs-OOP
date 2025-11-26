import java.util.Scanner;
class Employee{
    int empId;
    String empName;
    double empSalary;

    Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        empSalary = salary;
    }

    void displayemployee(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
}

public class EmployeeDetails {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details of Employee 1");
        System.out.println("Enter Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary1 = sc.nextDouble();

        Employee emp = new Employee(id1, name1, salary1);
        System.out.println("Enter Employee Details of Employee 2");
        System.out.println("Enter Employee ID: ");
        int id2 = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String name2 = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double salary2 = sc.nextDouble();
        Employee emp2 = new Employee(id2, name2, salary2);
        System.out.println("Employee Details:");
        emp.displayemployee();
        emp2.displayemployee();

        sc.close();
    }

}
