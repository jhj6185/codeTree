import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;

        for(int i=1; i<=b; i++){
            answer *= a;
        }

        System.out.print(answer);
    }
}