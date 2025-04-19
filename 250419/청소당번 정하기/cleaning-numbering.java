import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cCount = 0;
        int bCount = 0;
        int rCount = 0;

        for(int i=0; i<=n; i++){
            if(i == 0){
                continue;
            }

            if(i%12 ==0){
                rCount++;
            }else if(i%3 ==0){
                bCount++;
            }else if(i%2 ==0){
                cCount++;
            }
        }

        System.out.print(cCount + " " + bCount + " " + rCount);
    }
}