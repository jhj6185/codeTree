import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Please write your code here.

        int min = Integer.MAX_VALUE;

        for (int i=1; i<=n; i++){
            int sum = 0;
            for(int j=1; j<=n; j++){
                // System.out.println((j-i) * a[j-1]);
                sum+= Math.abs((j-i) * a[j-1]);
                // System.out.println("sum :: "+sum);
                
                // System.out.println("min :: "+min);
            }
            min = Math.min(min, sum);
        }

        System.out.print(min);
    }
}