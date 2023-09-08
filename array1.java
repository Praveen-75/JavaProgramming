import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        String words = "The sum of digit : ";
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (i != arr.length - 1) {
                words += arr[i] + " + ";
            } else {
                words += arr[i] + " ";
            }
        }
        System.out.println(words + " = " + sum);
    }
}
