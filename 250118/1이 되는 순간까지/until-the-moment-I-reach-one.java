import java.util.*;
public class Main {
    public static int count = 0;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(printCount(n));
    }

    public static int printCount(int n){
        if(n == 1){
            return count;
        }

        if(n % 2 == 0){
            count++;
            return printCount(n/2);
        }else{
            count++;
            return printCount(n/3);
        }
    }
}