import java.util.Arrays;

public class Array1 {
    static void rearrange(int arr[], int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        int arr[] = {1, -1, 2, -2, 3, -3, 4, -5, 6, -8};
        Arrays.sort(arr);
        rearrange(arr, arr.length);
        printArray(arr, arr.length);
    }
}
