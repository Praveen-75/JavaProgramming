import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        HashMap<Character, Integer> map = new HashMap<>();
        String s = sc.nextLine();
        //  String s = "Hello bhai kaise ho han bhai sab badiya hai tum sunao";
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int oldCount = map.get(s.charAt(i));
                map.put(s.charAt(i), ++oldCount);
            } else
                map.put(s.charAt(i), 1);
        }
        System.out.println(map);
    }
}
