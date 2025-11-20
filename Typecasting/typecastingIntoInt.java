import java.util.*;

class typecastingIntoInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int myINt = Integer.parseInt(num);
        myINt*=2;
        System.out.println(myINt);
    }
}