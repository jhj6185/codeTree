import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        boolean is3Besu=true;

        for(int i=0; i<5; i++){
            int n = sc.nextInt();

            if(n%3 !=0){
                is3Besu = false;
                break;
            }
        }

        System.out.print(is3Besu ? 1 : 0);
    }
}