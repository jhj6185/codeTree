import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= -1;
        for(int i=1; i<=n; i++){
            m+=2;

            for(int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}