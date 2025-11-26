import java.io.FileWriter;



public class Filewrite {
    public static void main(String[] args) {
        String message = "Hello, this is a sample text written to the file.";
        try {
            FileWriter fw = new FileWriter("C:/Users/BIJU/Desktop/programming saves/java programs/SampleFile.txt");
            fw.write(message);
            fw.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }   
}
