import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        int max= Math.max(a,b);
        max = Math.max(max,c);

        set.remove(max);
        int min= Math.min(a,b);
        min = Math.min(a,b);

        set.remove(min);

        for (Integer element : set) {
            System.out.println(element);
        }
    }
}