import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(printSum(n));
    }

    public static int printSum(int n){
        if(n <=2){
            return n;
        }

        return n + printSum(n-2);
    }
}