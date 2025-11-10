import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String[] args) {

        // Creating an ArrayList 
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        // Adding elements to the ArrayList 
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        // displaying the ArrayList 
        System.out.println("ArrayList : "+a);

        // Performing Operations
        a.remove(2);

        // Displaying Updated ArrayList 
        System.out.println("Updated ArrayList : " +a);
    }
}