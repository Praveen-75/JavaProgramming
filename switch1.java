import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int day = sc.nextInt();
        String res = " ";
        switch (day) {
            case 1 -> res = "Monday";
            case 2 -> res = "tuesday";
            case 3 -> res = "wednesday";
            case 4 -> res = "thursday";
            case 5 -> res = "friday";
            case 6 -> res = "saturday";
            case 7 -> res = "sunday";
            default -> res = "invalid";
        }
        System.out.println(res);
    }
}



