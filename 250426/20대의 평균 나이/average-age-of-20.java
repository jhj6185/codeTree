import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;

        while(n/10 ==2){
            sum+=n;
            count++;
            n=sc.nextInt();
        }

        System.out.printf("%.2f",sum / (count * 1.0));
    }
}