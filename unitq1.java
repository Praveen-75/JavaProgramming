import java.util.Scanner;

public class unitq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit");
        int unit = sc.nextInt();
        double units = 0;
        if (unit < 100) {
            units = unit * 4.2;
        } else if (unit < 200) {
            units = 100 * 4.2 + (unit - 100) * 6;
        } else if (unit < 400) {
            units = 100 * 4.2 + 100 * 2 + (unit - 200) * 8;
        } else if (unit >= 400) {
            units = 100 * 4.2 + 100 * 6 + 8 * 200 + (unit - 400) * 13;
        }
        System.out.println("Bill to pay : " + units);
    }
}
