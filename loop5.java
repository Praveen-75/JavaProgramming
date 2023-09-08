import java.util.Scanner;

public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (n == temp)
            System.out.println("special number");
        else
            System.out.println("not special");
    }
}
