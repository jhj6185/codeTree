import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int besu3 = 0;
        int besu5 = 0;
        for(int i=0; i<10; i++){
            int j = sc.nextInt();

            if(j%3 == 0){
                besu3++;
            }
            if(j%5==0){
                besu5++;
            }
        }

        System.out.print(besu3 + " " + besu5);
    }
}