public class bubble5 {
    public static int bubble(String arr[], String se) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (se == arr[mid])
                return mid;
            else if (se.compareTo(arr[mid]) > 0)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = {"DEEPAK", "KRATIKA", "PRAVEEN", "RAM", "PRIYANSHU", "SIMRAN", "SOHAM", "ZAHIR"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(bubble(arr, "SOHAM"));
    }
}