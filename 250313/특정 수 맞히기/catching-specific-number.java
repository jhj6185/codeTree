import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();

        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n < 25){
                System.out.println("Higher");
            }else if(n > 25){
                System.out.println("Lower");
            }else{
                System.out.println("Good");
            }

            
        }
    }
}