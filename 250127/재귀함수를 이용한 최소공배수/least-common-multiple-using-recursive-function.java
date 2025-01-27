import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        long answer = arr[0];
        for(int i=1; i<n; i++){
            answer = llm(answer,arr[i]);
        }

        System.out.print(answer);
    }

    public static long llm(long a, long b){
        return a * b / gcd(a,b);
    }

    public static long gcd(long a, long b){
        //두 양의 정수 a, b(a > b)에 대해서 a를 b로 나눈 나머지를 r이라 하면, a와 b의 최대공약수는 b와 r의 최대공약수와 같다
        while(b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}