
public class array4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7};
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for (int data : arr)
            System.out.print(data + " ");
    }
}
