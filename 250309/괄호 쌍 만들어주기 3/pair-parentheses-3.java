import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");
        // Please write your code here.
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(!"(".equals(arr[i])){
                continue;
            }

            for(int j=i+1; j<arr.length; j++){
                if(")".equals(arr[j])){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}