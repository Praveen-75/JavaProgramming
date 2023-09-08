public class bubble4 {
    public static int bubble(char arr[], char se) {
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
        char arr[] = {'D', 'E', 'K', 'L', 'P', 'Q', 'S', 'Z'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        System.out.println(bubble(arr, 'S'));

    }
}
