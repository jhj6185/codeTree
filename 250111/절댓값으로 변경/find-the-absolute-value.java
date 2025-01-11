import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        printAbsArr(num, sc);
    }

    public static void printAbsArr(int num, Scanner sc){
        int[] arr= new int[num];

        for(int i=0; i<num; i++){
            int scNum = sc.nextInt();

            if(scNum > 0){
                arr[i] = scNum;
            }else{
                arr[i] = scNum * -1;
            }
            
        }

        for(int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }
}