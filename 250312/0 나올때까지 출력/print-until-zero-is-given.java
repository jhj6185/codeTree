import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        while(n > 0){
            if(n > 0){
                System.out.println(n);

                n = sc.nextInt();
            }else{
                break;
            }
        }
    }
}