import java.util.Arrays;

public class Unique {
    public static boolean bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {76, 98, 6, 190, 3452, 64537, 149, 3, 1, 2, 87, 4, 3};
        Arrays.sort(arr);
        System.out.println(bubble(arr));
    }
}

