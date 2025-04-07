import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("-");

        System.out.printf("%d.%d.%d",
        Integer.parseInt(arr[2]),Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
    }
}