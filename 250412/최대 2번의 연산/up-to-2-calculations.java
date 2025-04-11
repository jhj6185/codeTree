import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a % 2 == 0){
            a /= 2;
            // System.out.println("a:::"+ a);
        }
        
        if(a%2 != 0){
            a+=1;
            a /=2;
        }

        System.out.print(a);
    }
}