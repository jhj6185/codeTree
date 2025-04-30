import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=1; i<=n*2-1; i++){
            for(int j=0; j<=count; j++){
                System.out.print("*");
            }
            System.out.println();

            if(i >= n){
                count--;
            }else{
                count++;
            }

            System.out.println();
        }
        
        
    }
}