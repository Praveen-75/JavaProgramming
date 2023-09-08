import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        String res = " ";
        while (n > 0) {
            int rem = n % 2;
            res = rem + res;
            n /= 2;
        }
        System.out.println(res);
    }
}
