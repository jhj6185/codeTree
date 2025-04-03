import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int num = n - i +1;
            for(int j=0; j<n; j++){
                if(j % 2 == 0){
                    System.out.print(i);
                }else{
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}