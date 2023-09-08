import java.util.Scanner;

public class cls23_10_21 {
    static boolean checkPerfectSquare(double num) {
        double data = Math.sqrt(num);
        return ((data - Math.floor(data)) == 0);
    }

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (checkPerfectSquare(num))
            System.out.println(num + " perfect square.");
        else
            System.out.println(num + " Not perfect square.");
    }
}
