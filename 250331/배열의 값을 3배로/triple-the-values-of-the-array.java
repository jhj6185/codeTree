import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int n = sc.nextInt();
                System.out.print(n*3 +" ");
            }
            System.out.println();
        }
    }
}