import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,b);
        max = Math.max(max,c);

        System.out.print(max);
    }
}