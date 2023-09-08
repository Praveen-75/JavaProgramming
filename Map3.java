import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map3 {
    public static int longChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int rem = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                temp = Math.max(map.get(s.charAt(i)), temp);
            }
            rem = Math.max(rem, i - temp + 1);
            map.put(s.charAt(i), i + 1);
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words");
        //String s = "abcabcbb";
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = res + s.charAt(i);
        }
        System.out.println(res);
        System.out.println(longChar(res));
    }
}
