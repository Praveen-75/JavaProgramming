import java.util.Scanner;

public class Hexadecimal_to_decimal {
    public static void main(String[] args) {
        int des = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String hexa = sc.nextLine();
        for (int i = hexa.length() - 1; i >= 0; i--) {
            if (hexa.charAt(i) >= '0' && hexa.charAt(i) <= '9') {
                des += ((hexa.charAt(i) - 48) * Math.pow(16, j));
                j++;
            } else if (hexa.charAt(i) >= 'A' && hexa.charAt(i) <= 'F') {
                des += ((hexa.charAt(i) - 55) * Math.pow(16, j));
                j++;
            }
        }
        System.out.println(des);
    }
}