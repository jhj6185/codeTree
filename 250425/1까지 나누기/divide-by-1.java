import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int count=0;

        for(int i=1; i<=n; i++){
            m/=i; 
            count++;
            if(m <=1){
                System.out.print(count);
                break;
            }
        }
    }
}