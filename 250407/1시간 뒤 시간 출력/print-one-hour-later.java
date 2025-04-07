import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr= sc.next().split(":");

        int h = Integer.parseInt(arr[0]) +1;
        int m = Integer.parseInt(arr[1]);

        System.out.printf("%d:%d",h,m);
    }
}