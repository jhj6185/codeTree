import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.printf("%.3f\n",Math.round(a * 1000.0)/1000.0);
        System.out.printf("%.3f\n",Math.round(b * 1000.0)/1000.0);
        System.out.printf("%.3f\n",Math.round(c * 1000.0)/1000.0);
    }
}