import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count3 = 0;
        int count5 = 0;

        for(int i=0; i<10; i++){
            arr[i]= sc.nextInt();

            if(arr[i] % 3 ==0){
                count3++;
            }
            if(arr[i] % 5 ==0){
                count5++;
            }
        }

        System.out.print(count3 + " " + count5);
    }
}