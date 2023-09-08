import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first input");
            int a = sc.nextInt();
            System.out.println("Enter second input");
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Zero not find out");
        } catch (InputMismatchException ex) {
            System.out.println("wrong input");
        } catch (Exception ex) {

        }
    }
}
