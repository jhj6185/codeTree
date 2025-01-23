import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

            System.out.print(printSum(N));
    }

    public static int printSum(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }

        return printSum(n/3) + printSum(n-1);
    }
}