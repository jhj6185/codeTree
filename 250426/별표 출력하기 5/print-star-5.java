import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //행 갯수
        //묶음 갯수
        //별 갯수
        
        for(int i=n; i>0; i--){
            
            for(int j=1; j<=i; j++){
                for(int k=i; k>=1; k--){
                System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        
    }
}