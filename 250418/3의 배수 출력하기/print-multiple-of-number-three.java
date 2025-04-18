import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count = 1;
        int m = 1;

        while(m <=n){
            m = count*3;
            
            if(m > n){
                break;
            }

            System.out.print(m + " ");
            count++;
        }
    }
}