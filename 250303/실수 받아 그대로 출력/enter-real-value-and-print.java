import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();

        System.out.printf("%.2f",Math.round(a * 100.0) / 100.0);
    }
}