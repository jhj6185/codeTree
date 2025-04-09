import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = a+b;
        double minus = a-b;

        System.out.printf("%.2f",sum/minus);
    }
}