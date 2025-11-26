import java.util.Scanner;
class Marks{
    float mark1;
    float mark2;
    float mark3;
    Marks(float m1, float m2, float m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    float total(){
        return mark1+mark2+mark3;
    }
    float average(){
        return mark1+mark2+mark3/3;
    }

    void displayResult(){
        System.out.println("Total Marks:"+ total());
        System.out.println("Average:"+ average());

    }
}
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks For 3 Subjects:");
        System.out.println("Enter The Mark Of Suibject 1:");
        float m1 = sc.nextFloat();
        System.out.println("Enter The Mark Of Suibject 1:");
        float m2 = sc.nextFloat();
        System.out.println("Enter The Mark Of Suibject 1:");
        float m3 = sc.nextFloat();
        Marks m = new Marks(m1,m2,m3);
        m.displayResult();
        sc.close();
    }
}
