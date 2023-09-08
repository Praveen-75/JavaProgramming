import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int[] arr = {100, 12, 15, 85, 63, 2, 34, 24, 94, 69};
        int n = sc.nextInt();
        boolean flag = false;
        for (int j : arr) {
            if (j == n) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Mil gya");
        else System.out.println("Nhi mila");
    }
}
