
public class bubble {
        public static void main(String[] args) {
            int arr[] = {76, 98, 6, 190, 3452, 64537, 149, 3, 1, 2, 87, 4};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int a : arr)
                System.out.print(a + " ");
    }
}
