import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("-");
        System.out.printf("010-%s-%s",arr[2],arr[1]);
    }
}