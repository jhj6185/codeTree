import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        if(n >= 1.0){
            System.out.print("High");
        }else if(n >= 0.5){
            System.out.print("Middle");
        }else{
            System.out.print("Low");
        }
    }
}