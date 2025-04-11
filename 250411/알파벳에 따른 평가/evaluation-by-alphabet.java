import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if('S' == c){
            System.out.print("Superior");
        }else if('A' == c){
            System.out.print("Excellent");
        }else if('B' == c){
            System.out.print("Good");
        }else if('C' == c){
            System.out.print("Usually");
        }else if('D' == c){
            System.out.print("Effort");
        }else{
            System.out.print("Failure");
        }
    }
}