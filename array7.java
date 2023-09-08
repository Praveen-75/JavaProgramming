import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String input = sc.nextLine();
        long evenSum = 0, oddSum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0)
                evenSum = evenSum + input.charAt(i) - '0';
            else
                oddSum = oddSum + input.charAt(i) - '0';
        }
        System.out.println(Math.abs(evenSum - oddSum));
    }
}
