import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printAb(a,b);
    }

    public static void printAb(int a, int b){
        if( a > b ){
            a += 25;
            b *= 2;
        }else{
            a *=2;
            b += 25;
        }

        System.out.print(a + " " + b);
    }
}