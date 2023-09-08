import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        //  int n = 111;
        int n = sc.nextInt();
        int sum = 0, cnt = 0, d = 0;
        while (n > 0) {
            d = n % 10;
            sum += d;
            cnt += 1;
            n = n / 10;
        }
        if (sum % cnt == 0) {
            System.out.println("Zebra number");
        } else {
            System.out.println("not zebra number");
        }
    }
}
