import java.util.*;
public class Main {
    public static int count = 1;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printNum(n);
    }

    public static void printNum(int n){
        printPlusNum(n);
        printMinusNum(n);
    }

    public static void printPlusNum(int n){
        if(count> n){
            System.out.println();
            return;
        }

        System.out.print(count++ + " ");     
        printPlusNum(n);
    }

    public static void printMinusNum(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");
        printMinusNum(n-1);
    }
}