import java.util.Scanner;

public class bubble3 {
    public static int bubble(int arr[], int se) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (se == arr[mid])
                return mid;
            else if (se > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 6, 76, 87, 98, 149, 190, 3452, 64537};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = sc.nextInt();
            System.out.print(bubble(arr, n));
    }
}

