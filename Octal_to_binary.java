import java.util.Scanner;

public class Octal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String s = sc.nextLine();
        int pow = 0, dec = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int bit = Character.getNumericValue(s.charAt(i));
            dec = dec + bit * (int) Math.pow(2, pow);
            //dec = dec + bit * (int) Math.pow(8, pow);
            pow++;
        }
        System.out.println(dec);
    }
}