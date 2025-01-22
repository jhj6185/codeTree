import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSY(n);
        System.out.print(count);
    }

    public static void printSY(int n){
        if(n == 1){
            return;
        }

        count++;
        if(n % 2 == 0){
            printSY(n /2);
        }else{
            printSY(n * 3 + 1);
        }
    }
}