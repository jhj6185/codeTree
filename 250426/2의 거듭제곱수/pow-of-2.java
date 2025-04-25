import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(true){
            if(n%2 !=0){
                break;
            }
            count++;
            n/=2;
        }

        System.out.print(count);
    }
}