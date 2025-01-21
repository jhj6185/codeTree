import java.util.*;
public class Main {
    public static int n = 0;
    public static int max = -1;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.print(returnMax(arr,count));
    }

    public static int returnMax(int[] arr, int count){
        if(count > n-1){
            return max;
        }
        int max2 =arr[count++];
        max = Math.max(max,max2);
        
        return returnMax(arr,count);
    }
}