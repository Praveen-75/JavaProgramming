import java.util.Scanner;

class cls25_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name");
        String name = sc.nextLine();
        if (age >= 18) {
            System.out.println("you are valid");
        } else {
            System.out.println(name+" you are not valid go to watch disney");
        }
    }
}