import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a,b);
        min = Math.min(min,c);

        System.out.print(a == min ? 1 : 0);
        System.out.print(a == b && b == c ? " "+ 1 : " "+ 0);
    }
}