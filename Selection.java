public class Selection {
    public static void main(String[] args) {
        int arr[] = {76, 98, 6, 190, 3452, 64537, 149, 3, 1, 2, 87, 4};
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int a : arr)
            System.out.print(a + ", ");
    }
}
