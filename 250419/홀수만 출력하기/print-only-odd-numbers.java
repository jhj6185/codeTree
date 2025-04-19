import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int j = sc.nextInt();
            if(j%2 == 1 && j%3 ==0){
                System.out.println(j);
            }
        }
    }
}