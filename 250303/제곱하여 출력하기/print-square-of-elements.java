import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            System.out.print((int) Math.pow(arr[i],2) + " ");
        }

        
    }
}