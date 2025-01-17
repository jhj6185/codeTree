import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(returnSum(n));
    }

    public static int returnSum(int n){
        if(n == 1){
            return 1;
        }

        return n + returnSum(n-1);
    }
}