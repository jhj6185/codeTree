import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        boolean isYoonYear = false;
        if(y % 4 == 0){
            isYoonYear = true;
            if(y % 100 == 0 && y % 400 != 0){
                isYoonYear = false;
            }
            
        }

        System.out.print(isYoonYear);
    }
}