import java.util.Scanner;

public class Decimal_to_Hexadecimal {
    public static String decTOHex(int dec) {
        String hex = "";
        while (dec > 0) {
            int rem = dec % 16;
            hex = switch (rem) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> rem;
            } + hex;
            dec /= 16;
        }
        return hex;
    }

    public static int hexToDec(String hex) {
        int dec = 0;// 1224ABCD
        int pow = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int bitValue;
            if (ch >= 'A' && ch <= 'F') {
                bitValue = switch (ch) {
                    case 'A' -> 10;
                    case 'B' -> 11;
                    case 'C' -> 12;
                    case 'D' -> 13;
                    case 'E' -> 14;
                    case 'F' -> 15;
                    default -> 0;
                };
            } else bitValue = Character.getNumericValue(ch);
            dec = dec + bitValue * (int) Math.pow(16, pow++);

        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexadecimal number");
        String n = sc.nextLine();
        System.out.println(hexToDec(n));
    }
}
