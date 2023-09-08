import java.util.Scanner;

public class method3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        //int n = 109;
        while (n > 9) {
            n = sod(n);
        }
        System.out.println(n == 1 ? "Special" : "not Special");
    }


    public static int sod(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}
