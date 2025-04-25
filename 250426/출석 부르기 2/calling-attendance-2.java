import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int i = sc.nextInt();

            if(1 == i){
                System.out.println("John");
            }else if(2 ==i){
                System.out.println("Tom");
            }else if(3 ==i){
                System.out.println("Paul");
            }else if(4 == i){
                System.out.println("Sam");
            }else{
                System.out.println("Vacancy");
                break;
            }
        }
    }
}