public class bubble2 {
    public static void main(String[] args) {
        String arr[] = {"SIMRAN", "PRAVEEN", "ZAHIR", "PRIYANSHU", "RAM", "DEEPAK", "SOHAM", "KRATIKA"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String a : arr)
            System.out.print(a + " ");
    }
}
