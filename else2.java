import java.util.Scanner;

public class else2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid");
        } else if (age >= 18) {
            System.out.println("Congrats " + name + " you are valid voter");
        } else {
            System.out.println("Invalid voter you can vote after " + (18 - age) + " Year");
        }

    }
}
