import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if(gender == 0 && age >= 19){
            System.out.print("MAN");
        }else if(gender == 0 && age < 19){
            System.out.print("BOY");
        }else if(gender == 1 && age >= 19){
            System.out.print("WOMAN");
        }else{
            System.out.print("GIRL");
        }
    }
}