import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String s = sc.nextLine();
//        String s = "ABCDE@#$";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);
                } else {
                    ch = (char) (ch + 32);
                }
            }
            res = res + ch;
        }
        System.out.println(s);
        System.out.println(res);
    }
}

//Lexicographically
