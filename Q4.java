import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any choice amount");
        int amt = sc.nextInt();
        int no2000 = 0, no500 = 0, no200 = 0, no100 = 0, no50 = 0, no20 = 0, no10 = 0, no5 = 0, no2 = 0, no1 = 0;
        if (amt >= 2000) {
            no2000 = amt / 2000;
            amt = amt % 2000;
        }
        if (amt >= 500) {
            no500 = amt / 500;
            amt = amt % 500;
        }
        if (amt >= 200) {
            no200 = amt / 200;
            amt = amt % 200;
        }
        if (amt >= 100) {
            no100 = amt / 100;
            amt = amt % 100;
        }
        if (amt >= 50) {
            no50 = amt / 50;
            amt = amt % 50;
        }
        if (amt >= 20) {
            no20 = amt / 20;
            amt = amt % 20;
        }
        if (amt >= 10) {
            no10 = amt / 10;
            amt = amt % 10;
        }
        if (amt >= 5) {
            no5 = amt / 5;
            amt = amt % 5;
        }
        if (amt >= 2) {
            no2 = amt / 2;
            amt = amt % 2;
        }
        if (amt > 1) {
            no1 = amt / 1;
            amt = amt % 1;
        }
        //no1 = amt;
        System.out.println("2000 * " + no2000 + " = " + (2000 * no2000));
        System.out.println("500 * " + no500 + " = " + (500 * no500));
        System.out.println("200 * " + no200 + " = " + (200 * no200));
        System.out.println("100 * " + no100 + " = " + (100 * no100));
        System.out.println("50 * " + no50 + " = " + (50 * no50));
        System.out.println("20 * " + no20 + " = " + (20 * no20));
        System.out.println("10 * " + no10 + " = " + (10 * no10));
        System.out.println("5 * " + no5 + " = " + (5 * no5));
        System.out.println("2 * " + no2 + " = " + (2 * no2));
        System.out.println("1 * " + no1 + " = " + (1 * no1));
    }
}

