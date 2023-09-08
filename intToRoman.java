import java.util.Scanner;

public class intToRoman {
    public static String intToRoman(int num) {
        String String[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int arr[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while (num >= arr[i]) {
                num -= arr[i];
                sb.append(String[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = sc.nextInt();
        System.out.println(intToRoman(n));
    }
}
