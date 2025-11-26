import java.util.Scanner;

 class Cuboid {
	double length;
	double breadth;
	double height;

	  public void setDimension(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

	public double calculateVolume() {
		double volume = height*length*breadth;
		return volume;
	}
	public double calculateSurfaceArea() {
        return 2 * (length * breadth + height * breadth + length * height);
    }
	public double calculateTotal(){
		double total = (length+breadth+height);
		return total;
	}

}
public class CuboidDemo {
	public static void main(String[] args)
	{
				System.out.println("Please enter the length,breadth,height of the cuboid:");
				Scanner sc = new Scanner(System.in);
				double length = sc.nextDouble();
				double breadth= sc.nextDouble();
				double height = sc.nextDouble();
				Cuboid v1 = new Cuboid();
				v1.setDimension(length, breadth, height);
				double volume =v1.calculateVolume();
				System.out.println("Volume of the cuboid with dimensions: "+length+"* "
				+breadth+" *"+height+" is :"+volume);
				double surfaceArea = v1.calculateSurfaceArea();
		        System.out.println("Surface Area of the box is: " + surfaceArea); 
				double total = v1.calculateTotal();
				System.out.println(total);
				sc.close();
			}
	}