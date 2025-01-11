import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        printNums(a,b);
    }

    public static void printNums(int a, int b){
        if(a > b){
            a *= 2;
            b += 10;
        }else{
            a += 10;
            b *=2;
        }

        System.out.print(a + " "+ b);
    }
}