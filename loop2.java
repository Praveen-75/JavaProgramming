import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 1) {
            fact = fact * n;
            n--;
        }
        System.out.println(fact);
    }
}
