import java.util.Scanner;

public class method1 {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        // int n = 145;
        int sum = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + fact(rem);
            n = n / 10;
        }
        if (sum == temp) System.out.println("strong");
        else System.out.println("weak");
    }
}


