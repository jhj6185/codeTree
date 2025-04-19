import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sum+= a;
        }

        System.out.printf("%d %.1f",sum, sum/(n*1.0));
    }
}