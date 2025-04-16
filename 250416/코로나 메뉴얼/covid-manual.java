import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int aCount = 0;
        
        for(int i=0; i<3;i++){
            char isCorona = sc.next().charAt(0);
            int temperture = sc.nextInt();

            if(isCorona == 'Y' && temperture >= 37){
                aCount++;
            }
        }

        System.out.println(aCount >= 2 ? 'E' : 'N');
    }
}