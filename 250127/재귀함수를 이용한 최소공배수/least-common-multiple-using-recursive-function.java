import java.util.*;
public class Main {
    public static int[] arr = new int[10];
    public static int count = 0;
    public static int n = 10;
    public static int gb = 1;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(gongBae(1));
    }
    
    public static int gongBae(int i){
        if(i >= n){
            return 1;
        }

        int max = Math.max(arr[i-1], arr[i]);
        int min = Math.min(arr[i-1],arr[i]);

        if(max == arr[i-1]){
            return min * gongBae(i+1);
        }

        return max * gongBae(i+1); // 1 * 5 * 
        
    }
}