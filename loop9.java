import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int n = sc.nextInt();
        int x = n;
        int y = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j <= x) {
                    System.out.print((char) (j + 64) + " ");
                } else if (j >= y) {
                    int m = (n * 2 - j);
                    System.out.print((char) (m + 64) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            x--;
            y++;
        }
    }
}


//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 7; j++) {
//                if ((i == 0 && j % 3 != 0) || (i == 1 && j % 3 == 0) || i - j == 2 || (i + j == 8)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}