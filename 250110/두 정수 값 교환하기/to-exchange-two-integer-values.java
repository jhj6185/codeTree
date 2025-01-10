import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        exchange(n,m);
    }

    public static void exchange(int n, int m){
        System.out.print(m + " "+ n);
    }
}