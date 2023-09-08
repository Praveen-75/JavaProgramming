public class args1 {
    public static void sum(int... arr) {
        int sum = 0;
        for (int a : arr) sum += a;
        System.out.println(" Sum of digit = " + sum);
    }


    public static void main(String[] args) {
        sum(10, 20, 30, 40, 50, 49, 34);
    }
}
