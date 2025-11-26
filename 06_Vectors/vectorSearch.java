//important program... Search for a String Element tutorial 5 - 5th question
import java.util.Scanner;
import java.util.Vector;
public class vectorSearch{
    public static void main(String[] args) {
        Vector<String>items = new Vector<>();
        items.add("pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Item To Search: ");
        String search = sc.nextLine();
        sc.close();
        int flag =0;
        for(String item: items){
            if(item.equalsIgnoreCase(search)){
                flag=1;
            }
        }
        if(flag==1){
             System.out.println("Item Found !");
        }
        else{
            System.out.println("Item Not Found");
        }
        sc.close();
    }
}