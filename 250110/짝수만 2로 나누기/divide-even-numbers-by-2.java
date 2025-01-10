import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";

        for(int i=0; i<num; i++){
            int n = sc.nextInt();
            
            if(n % 2 == 0){
                str += (n / 2);
            }else{
                str += n;
            }

            str += " ";
        }

        System.out.print(str);
    }
}