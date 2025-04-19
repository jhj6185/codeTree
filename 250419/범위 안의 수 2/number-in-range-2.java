import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int cnt = 0;

        for(int i=0; i<10; i++){
            int a = sc.nextInt();

            if(a >=0 && a<=200){
                sum+=a;
                cnt++;
            }
        }

        System.out.printf("%d %.1f",sum, sum/(cnt*1.0));
    }
}