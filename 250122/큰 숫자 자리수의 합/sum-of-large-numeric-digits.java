import java.util.*;
public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(printSum(a*b*c));
    }

    public static int printSum(int num){
        if(num == 0){
            return 0;
        }

        sum = num % 10 + printSum(num /10);

        return sum;
    }
}