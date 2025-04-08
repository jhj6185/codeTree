import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next().replace(".","-");
        String[] arr = str.split("-");

        System.out.printf("%s-%s-%s",arr[1],arr[2],arr[0]);
    }
}