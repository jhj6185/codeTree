import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        for(int i=b; i>=a; i-=2){
            System.out.print(i + " ");
        }
    }
}