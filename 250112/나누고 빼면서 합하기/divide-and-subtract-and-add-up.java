import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
       int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        printM(arr, m);
    }

    public static void printM(int[] arr, int m){
        int sum = 0;
        while(m >= 1){
            sum += arr[m-1];

            if (m % 2 == 0){
                m /= 2;
            }else{
                m -=1;
            }
        }

        System.out.print(sum);
    }
}