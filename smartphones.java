public class smartphones {
    String make;
    String modelName;
    int price;


    public void call(){
        System.out.println("Calling from " + make + " " + modelName);
    }
    static void message(){
        System.out.println("Sending message from smartphones class");
    }

    public static void main(String[] args) {
    smartphones phone1 = new smartphones();
    phone1.make = "Samsung";
    phone1.modelName = "Galaxy S21";
    phone1.price = 799;


    System.out.println("Phone1 Make: " + phone1.make);
    System.out.println("Model Name: " + phone1.modelName);
    System.out.println("Price: " + phone1.price);

    phone1.price = 749; // Updating price
    System.out.println("Updated Price: " + phone1.price);

    smartphones phone2 = new smartphones();
    phone2.make = "Moto";
    phone2.modelName = "G64 5G";
    phone2.price = 16999;


    System.out.println("Phone2 Make: " + phone2.make);
    System.out.println("Model Name: " + phone2.modelName);
    System.out.println("Price: " + phone2.price);

    smartphones phone3 = new smartphones();
    phone3.make = "Apple";
    phone3.modelName = "iPhone 13";
    phone3.price = 34999;

    System.out.println("Phone3 Make: " + phone3.make);
    System.out.println("Model Name: " + phone3.modelName);
    System.out.println("Price: " + phone3.price);

    phone1.call(); // Calling method to demonstrate functionality
    phone2.call();
    phone3.call();
    
    smartphones.message(); // Static method call to demonstrate functionality

}

    
}

