import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean isCBasu = false;
        for(int i=a; i<=b; i++){
            if(i % c == 0){
                isCBasu = true;
                break;
            }
        }

        System.out.print(!isCBasu? "YES" : "NO");

    }
}