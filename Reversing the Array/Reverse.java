import java.util.*;

public class Reverse {
    public static void reverseArray(int arr []) {
        int first = 0 ;
        int last = arr.length-1 ;
        
            while (first<last) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;

                first++;
                last--;
            }
            
        System.out.println("Reversed Array : "+Arrays.toString(arr));
    }
    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5,6} ;
        System.out.println("Array :"+ Arrays.toString(arr));

        reverseArray(arr);
    }
}