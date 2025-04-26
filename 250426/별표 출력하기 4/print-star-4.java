import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count=n;

        for(int j=1; j<= n*2-1; j++){
            for(int i=0; i<count; i++){
                System.out.print("* ");
            }
            System.out.println();

            if(j >= n){
                count++;
            }else{
                count--;
            }
        }
    }
}