import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        isPalindrome(a);
    }

    public static void isPalindrome(String a){
        // System.out.print("a ::: "+ a);
        StringBuffer sb = new StringBuffer(a);
        String reverseStr = sb.reverse().toString();
        
        if(reverseStr.equals(a)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}