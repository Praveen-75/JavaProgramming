import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] data : arr) {
            for (int ans : data) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}


