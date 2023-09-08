import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any words");
        String s = sc.nextLine();
        // String s = "aba";
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        System.out.println(s);
        System.out.println(res);
        System.out.println(s.equals(res) ? "Palindrome" : "Not Palindrome");
    }
}
