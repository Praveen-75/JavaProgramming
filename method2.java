import java.util.Scanner;

public class method2 {
    public static int cubeSum(int n) {
        int cubeSum = 1;
        for (int i = 1; i <= n; i++) cubeSum *= i;
        return cubeSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number=");
        int n = sc.nextInt();
        int num = n;
        int cubeSum = 0;
        while (num > 0) {
            int rem = num % 10;
            cubeSum = cubeSum + (rem * rem * rem);
            num = num / 10;
        }
        if (n == cubeSum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}


