import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        for(int i=0; i<10; i++){
            int j = sc.nextInt();

            if(j % 2 ==1){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}