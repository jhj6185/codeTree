import java.util.*;
public class Main {
    public static int a = 0;
    public static int b = 0;
    public static int N = 0;
    public static int count =2;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        System.out.print(printSY100(N));
    }

    public static int printSY100(int n){
        if(count == N){
            return n % 100;
        }
        count++;
        if(count == 3){
            a = 2;
            b = 4;
        }else{
            a = b;
            b = n;
        }

        // System.out.println("a :: "+a +"\nb :: " + b + "count" + count + "\n n :: "+a*b);

        return printSY100(a * b);
    }
}