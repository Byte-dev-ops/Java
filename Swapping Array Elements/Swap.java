import java.util.*;

public class Swap {
    static void swap(int arr[] , int index1 , int index2 ) {
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;

        System.out.println("Array after swapping " +Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array ");
        for( int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before swapping " + Arrays.toString(arr));

        swap(arr , 1 ,3);
    }

}
