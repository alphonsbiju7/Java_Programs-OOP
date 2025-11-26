import java.util.Scanner;
class Employee {
    long empId;
    String empName;
    double empSalary;

    Employee(long empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    void EmployeeDetails() {
        System.out.println(empId + "   " + empName + "   " + empSalary);
    }
}
public class EmployeeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i <n; i++) {

            System.out.println("Enter The Details Of Employee " +(i+1));
            System.out.print("Enter The Employee Id, Name And Salary: ");
            long id = sc.nextLong();
            sc.nextLine();
            String name = sc.nextLine();
            double salary = sc.nextDouble();
            emp[i] = new Employee(id, name, salary);
        }
        System.out.println("\nEmployee Details:");
        System.out.println("Id\tName\tSalary");
        for (int i = 0; i <n; i++) {
            emp[i].EmployeeDetails();
        }
        sc.close();

    }

}