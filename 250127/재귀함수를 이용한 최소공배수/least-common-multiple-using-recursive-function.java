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

        int answer = arr[1];
        for(int i=1; i<n; i++){
            answer = llm(answer,arr[i]);
        }

        System.out.print(answer);
    }

    public static int llm(int a, int b){
        return a * b / gcd(a,b);
    }

    public static int gcd(int a, int b){
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        if(max % min == 0){
            return min;
        }else{
            return 1;
        }
    }
}