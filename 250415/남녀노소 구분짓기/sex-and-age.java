import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex == 0){
            if(age >= 19){
                System.out.print("MAN");
            }else{
                System.out.print("BOY");
            }
        }else{
            if(age >= 19){
                System.out.print("WOMAN");
            }else{
                System.out.print("GIRL");
            }
        }
    }
}