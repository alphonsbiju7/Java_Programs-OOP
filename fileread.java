import java.io.FileReader;

public class fileread {
    public static void main(String[] args) {
        char [] data  = new char[100];
        try {
            FileReader fr = new FileReader("C:/Users/BIJU/Desktop/programming saves/java programs/SampleFile.txt");
            fr.read(data);
            System.out.println("Data read from the file:");
            System.out.println(data);
            fr.close();
        } catch (Exception e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
     
}
