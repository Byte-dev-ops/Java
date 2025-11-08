package Array;
import java.util.*;

public class ArrayExample {
    public static void main (String args[]) {
        int arr [] = {1,2,3,4,5};

        // normal method to display array
        for(int i = 0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }


        // Using Enhanced for loop to display the array 
        for (int num :arr) {
            System.out.println(num);
        }


        // Using To String method to display the array
        System.out.println(Arrays.toString(arr));


    }
}