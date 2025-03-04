import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";

        for(int i=0; i<str.length(); i++){
            
            if(i == 1 || i == (str.length() -2)){
                ans += 'a';
            }else{
                ans+= str.charAt(i);
            }
        }

        System.out.print(ans);
    }
}