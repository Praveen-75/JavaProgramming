import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        // int n = 153;
        int tem = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if (sum == tem) {
            System.out.println("ArmStrong");
        } else System.out.println("AemWeak");
    }
}
