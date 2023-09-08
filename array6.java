import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("press 1 for addition\npress 2 for sub\npress 3 for multi\npress 4 for div\npress 0 for exit");
            int day = sc.nextInt();
            switch (day) {
                case 1 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    int addition = a + b;
                    System.out.println("sum = " + addition);
                    break;
                }
                case 2 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    int sub = a - b;
                    System.out.println("sub = " + sub);
                    break;
                }
                case 3 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    int multi = a * b;
                    System.out.println("multi = " + multi);
                    break;
                }
                case 4 -> {
                    System.out.println("Enter first number");
                    int a = sc.nextInt();
                    System.out.println("Enter second number");
                    int b = sc.nextInt();
                    int div = a / b;
                    System.out.println("div = " + div);
                    break;
                }
                default -> System.out.println("program is exiting");
            }
        } while (true);
    }
}