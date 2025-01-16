import java.util.*;
public class Main {
    public static int n = 0;
    public static void main(String[] args) {

        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        printNum(n);
    }

    public static void printNum(int num){
        if(num < 1){
            return;
        }

        System.out.print(num+ " ");
        printNum(num - 1);
        System.out.print(num+ " ");
    }
}