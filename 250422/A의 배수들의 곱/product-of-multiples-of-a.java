import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;

        for(int i=1; i<=b; i++){
            if(i % a == 0){
                ans *= i;
            }
        }

        System.out.print(ans);
    }
}