import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char rank = 'F';
        
        if(n >= 90){
            rank = 'A';
        }else if(n>=80){
            rank = 'B';
        }else if(n>=70){
            rank = 'C';
        }else if(n>=60){
            rank = 'D';
        }else{
            rank = 'F';
        }

        System.out.print(rank);
    }
}