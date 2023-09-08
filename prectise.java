import java.util.Scanner;

public class prectise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x number");
        int x = sc.nextInt();
        System.out.println("Enter y number");
        int y = sc.nextInt();
        System.out.println("Enter z number");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("Largest number x is:" + x);
        } else if (y > z) {
            System.out.println("Largest number y is:" + y);
        } else {
            System.out.println("Largest number z is:" + z);
        }

    }
}
