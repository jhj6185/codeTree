import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int count= 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i]){
                    continue;
                }

                for(int k=j+1; k<n; k++){
                    if(arr[k] >= arr[j]){
                        count++;
                    }
                }

            }
        }

        System.out.print(count);
    }
}