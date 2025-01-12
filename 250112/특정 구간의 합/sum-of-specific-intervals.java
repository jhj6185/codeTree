import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printSum(arr, sc, m);
    }

    public static void printSum(int[] arr, Scanner sc, int m){
        for(int i=0; i<m; i++){
            int sum = 0;
            int a= sc.nextInt();
            int b = sc.nextInt();

            for(int j=a-1; j<=b-1; j++){
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
}