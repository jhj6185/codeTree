import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(sc.nextInt() % 5 == 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}