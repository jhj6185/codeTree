import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n ==1){
            System.out.print("John");
        }else if(n ==2){
            System.out.print("Tom");
        }else if(n == 3){
            System.out.print("Paul");
        }else{
            System.out.print("Vacancy");
        }
    }
}