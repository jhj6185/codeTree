import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] downArr = new Integer[n];
        int[] upArr = new int[n];

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            upArr[i] = num;
            downArr[i] = num;
        }

        Arrays.sort(upArr);
        Arrays.sort(downArr,Collections.reverseOrder());

        for(int up: upArr){
            System.out.print(up + " ");
        }
        System.out.println();

        for(Integer down: downArr){
            System.out.print(down + " ");
        }
    }
}