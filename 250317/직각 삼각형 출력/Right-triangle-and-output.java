import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "*";

        for(int i=1; i<=n; i++){
            System.out.println(str);
            str+="**";
        }
    }
}