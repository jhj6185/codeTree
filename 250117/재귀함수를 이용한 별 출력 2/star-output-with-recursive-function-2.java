import java.util.*;
public class Main {
    public static int num = 0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        printStar(num);
    }

    public static void printStar(int n){
        if(n <= 0 || n> num){
            return;
        }

        for(int i=0; i<n; i++){
            System.out.print("* ");
        }

        System.out.println();
        printStar(n-1);

        // n이 1이 아닐 때만 다시 출력
        if(n != 0) {
            // 현재 줄 다시 출력
            for(int i=0; i<n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}