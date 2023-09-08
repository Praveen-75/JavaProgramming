import java.util.Scanner;

public class else3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any amount");
        double amt = sc.nextDouble();
        double disPer = 0;
        if (amt > 5000 && amt <= 8000) {
            disPer = 25;
        }
        if (amt > 8000) {
            disPer = 40;
        }
        double disPrice = amt - amt * disPer / 100;
        //double disPrice = amt * (100 - disPer) / 100;
        System.out.println("discount price " + disPrice);
    }
}
