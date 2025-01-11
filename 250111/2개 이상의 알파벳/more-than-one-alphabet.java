import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        isManyAlphabet(str);
    }

    public static void isManyAlphabet(String str){
        HashSet<Character> set = new HashSet<>();
        for(char s : str.toCharArray()){
            set.add(s);
        }

        if(set.size() >= 2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}