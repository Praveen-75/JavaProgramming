import java.util.Scanner;

public class array8 {
    public static int rowSum(int[] arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        return sum;
    }


    public static void main(String[] args) {
        int[][] arr = {{7, 7, 3}, {4, 5, 8}, {6, 2, 9}};
        boolean isSpecialMatrix = true;
        int sum1 = 0;
        int sum = rowSum(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int curSum = rowSum(arr[i]);
            sum1 += rowSum(arr[i]);
            if (sum != curSum) {
                isSpecialMatrix = false;
                break;
            }
        }
        System.out.println(isSpecialMatrix ? "Special Matrix" : "Not Special Matrix");
        System.out.println("Total Diagonals sum : " + sum1);
    }
}
