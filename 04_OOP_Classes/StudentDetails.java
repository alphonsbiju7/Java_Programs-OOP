import java.util.Scanner;
import java.util.Arrays;

class Student {
    int regNo;
    String name;
    String course;
    int marks[] = new int[6];
    int total;
    int rank;
    int Total() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += marks[i];
        }
        total = sum;
        return sum;
    }
    void displayStudent() {
        System.out.println(regNo + " " + name + " " + course + "  " + total + "  " + rank);
    }
}
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("\nEnter Details Of Student " + (i + 1));
            System.out.print("Name: ");
            s[i].name = sc.nextLine();
            System.out.print("Reg No: ");
            s[i].regNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Course: ");
            s[i].course = sc.nextLine();

            for (int j = 0; j < 6; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                s[i].marks[j] = sc.nextInt();
            }
            sc.nextLine();
            s[i].Total();
        }
        Arrays.sort(s, (a, b) -> b.total - a.total);
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && s[i].total == s[i - 1].total) {
                s[i].rank = s[i - 1].rank;
            } else {
                s[i].rank = rank;
            }
            rank++;
        }
        System.out.println("\nStudent Report:");
        System.out.println("RegNo Name   Course Total Rank");
        System.out.println("------------------------------------"); 
        for (Student student : s) {
            student.displayStudent();
        }
        sc.close();
    }
}



