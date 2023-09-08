import java.util.Scanner;

public class Anagram {
    public boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for (char ch : s1.toCharArray())
            a[ch - 'a']++;
        for (char ch : s2.toCharArray())
            b[ch - 'a']++;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(new Anagram().anagram(a, b));
//        System.out.println(anagram(a,b));
    }
}
