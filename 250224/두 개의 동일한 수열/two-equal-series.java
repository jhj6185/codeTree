import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please Write your code.
        
        boolean isEqual = false;
        for(int i: a){
            isEqual = false;
            for(int j: b){
                if(i == j){
                    isEqual = true;
                    break;
                }
            }

            if(isEqual == false){
                System.out.print("No");
                break;
            }
        }

        if(isEqual == true){
            System.out.print("Yes");
        }
    }
}