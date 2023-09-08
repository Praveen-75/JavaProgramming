import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 1 for addition\nPress 2 for sub\nPress 3 for multi\nPress 4 for div\nPress 0 for exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                int sum = a + b;
                System.out.println("Sum ho gya " + sum);
            } else if (ch == 2) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                int sub = a - b;
                System.out.println("Sub ho gya " + sub);
            } else if (ch == 3) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                int multi = a * b;
                System.out.println("Multi ho gya " + multi);
            } else if (ch == 4) {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                int div = a / b;
                System.out.println("Div ho gya " + div);
            } else if (ch == 0) {
                System.out.println("Program is exiting");
                break;
            }
        } while (true);
    }
}

