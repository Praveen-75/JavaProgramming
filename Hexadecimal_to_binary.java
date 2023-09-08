import java.util.Scanner;

public class Hexadecimal_to_binary {
    public static int Program(String s) {
        String hexa = "0123456789ABCDEF";
        s = s.toUpperCase();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int m = hexa.indexOf(ch);
            num = 16 * num + m;
        }
        return num;
    }

    public static void main(String[] args) {
        int k = 1;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String hum = sc.nextLine();
        int n = Program(hum);
        while (n != 0) {
            arr[k++] = n % 2;
            n = n / 2;
        }
        System.out.print("Converted to binary ");
        for (int i = k - 1; i > 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
}
