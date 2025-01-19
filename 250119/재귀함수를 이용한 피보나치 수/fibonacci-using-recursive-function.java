import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(fibonachi(n));
    }

    public static int fibonachi(int n){
        if(n == 1 || n ==2){
            return 1;
        }

        return fibonachi(n-1) + fibonachi(n-2);
    }
}