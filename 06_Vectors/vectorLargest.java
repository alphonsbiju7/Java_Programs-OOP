import java.util.Vector;

public class vectorLargest {
    public static void main(String[] args) {
        Vector<Integer>numbers = new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max =0;

        for(Integer num: numbers){
            if(num>max){
                max=num;
            }

                }
        System.out.println("Largest is: " + max);
    }
    
}
