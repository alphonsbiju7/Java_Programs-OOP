//tut-7 2
import java.util.Scanner;
class Students{
    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
class studentAccount extends Students{
    float collegeFee;

    void setCollegeFee(float collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayAccountInfo() {
        System.out.println("Fees: " + collegeFee);
    }
}
class Hosteller extends studentAccount{
    float hostelFee;
    float messFee;

    void setHostelDetails(float hostelFee, float messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayHostelInfo() {
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fees: "+(collegeFee+hostelFee+messFee));

    }
}
class DayScholar extends studentAccount{
    float busFee;

    void setdayscholarDetails(float busFee) {
        this.busFee = busFee;
    }

    void displayDayscholarInfo() {
        System.out.println("bus Fee: " + busFee);
        System.out.println("Total Fees: "+(collegeFee+busFee));
    
    }
}
public class CollegeStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller hosteller = new Hosteller();
        DayScholar dayScholar = new DayScholar();

        System.out.println("Enter Hosteller Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("College Fee: ");
        float collegeFee = sc.nextFloat();
        System.out.print("Hostel Fee: ");
        float hostelFee = sc.nextFloat();
        System.out.print("Mess Fee: ");
        float messFee = sc.nextFloat();
        hosteller.setDetails(name, rollNo, course);
        hosteller.setCollegeFee(collegeFee);
        hosteller.setHostelDetails(hostelFee, messFee);
    
        System.out.println("Enter Day Scholar Details:");
        sc.nextLine();
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        course = sc.nextLine();
        System.out.print("College Fee: ");
        collegeFee = sc.nextFloat();
        System.out.print("Bus Fee: ");
        float busFee = sc.nextFloat();
        dayScholar.setDetails(name, rollNo, course);
        dayScholar.setCollegeFee(collegeFee);
        dayScholar.setdayscholarDetails(busFee);

        System.out.println("Hosteller Information:");
        hosteller.displayStudentInfo();
        hosteller.displayAccountInfo();
        hosteller.displayHostelInfo();

        System.out.println("Day Scholar Information:");
        dayScholar.displayStudentInfo();
        dayScholar.displayAccountInfo();
        dayScholar.displayDayscholarInfo();
        sc.close();

        
    }
    
}
