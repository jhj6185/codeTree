import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i% 2 ==0){
                continue;
            }else if(i%10 == 5){
                continue;
            }else if(i% 3  == 0 && i%9!=0){
                continue;
            }else{
               System.out.print(i + " "); 
            }
        }
    }
}