import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
       Scanner sc = new Scanner(System.in);
       char c = sc.next().charAt(0);
       String[] arr = {"apple","banana","grape","blueberry","orange"};
        int count = 0;
       for(String a : arr){
        if(a.charAt(2) == c || a.charAt(3) == c){
            count++;
            System.out.println(a);
        }
       }

       System.out.print(count);
    }
}