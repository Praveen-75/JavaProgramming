import java.util.Scanner;

public class cls25_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}
