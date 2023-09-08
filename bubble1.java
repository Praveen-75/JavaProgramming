public class bubble1 {
    public static void main(String[] args) {
        char arr[] = {'S', 'P', 'Z', 'Q', 'L', 'E', 'D', 'K'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (char a : arr)
            System.out.print(a + " ");
    }
}
