import java.util.Scanner;
class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle:" + area);
    }

    void displayCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle:" + circumference);
    }
}


public class CircleCalc {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.displayArea();
        c.displayCircumference();

        sc.close();
    }
}


