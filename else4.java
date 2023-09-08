import java.util.Scanner;

public class else4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in our Restaurant");
        int ch;
        int in, chi, itn;
        do {
            System.out.println("Sir/Madam please select any of these..");
            System.out.println("Press 1 for Indian.\nPress 2 for chinese.\nPress 3 for Italian.");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("You select Indian");
                System.out.println("Items list \n1 for Masala dosa\n2 for Chaat\n3 for Dal makhani\n4 for vada" +
                        " pav\n5 for Dhokla\n6 for Idli\n7 for pulao\n8 for Pav bhaji\n9 for Palak paneer\n10 for Kichdi");
                in = sc.nextInt();
                if (in == 1 || in == 2 || in == 3 || in == 4 || in == 5 || in == 6 || in == 7 || in == 8 || in == 9 || in == 10) {
                }
                switch (in) {
                    case 1 -> System.out.println("Your bill is ₹:-200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 2 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 3 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 4 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 5 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 6 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 7 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 8 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 9 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 10 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    default -> System.out.println("Invalid Input");
                }
            }
            if (ch == 2) {
                System.out.println("You select Chinese");
                System.out.println("Items list \n1 for Dumplings\n2 for Kung pao Chicken\n3 for Chow mein\n4" +
                        " for Yangzhou Fried Rice\n" + "5 for Fish-Flavored Shredded Pork\n6 for Sweet and Sour Pork Filler\n" +
                        "7 for Scrambled Eggs with Tomatoes\n8 for Hot Pot\n9 for Ma PO Tofu\n10 for Spring Rolls");
                chi = sc.nextInt();
                if (chi == 1 || chi == 2 || chi == 3 || chi == 4 || chi == 5 || chi == 6 || chi == 7 || chi == 8 || chi == 9 || chi == 10) {
                }
                switch (chi) {
                    case 1 -> System.out.println("Your bill is ₹:-200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 2 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 3 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 4 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 5 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 6 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 7 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 8 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 9 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 10 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    default -> System.out.println("Invalid Input");
                }
            }
            if (ch == 3) {
                System.out.println("You select Italian");
                System.out.println("Items list \n1 for Pizza Napoletana\n2 for Lasagna\n3 for Ossobuco alla Milanese\n4 for Gelato" +
                        "\n5 for Panzanella\n6 for Focaccia\n7 for Spaghetti\n8 for Cicchetti\n9 for Caponata\n10 for Burrata");
                itn = sc.nextInt();
                if (itn == 1 || itn == 2 || itn == 3 || itn == 4 || itn == 5 || itn == 6 || itn == 7 || itn == 8 || itn == 9 || itn == 10) {
                }
                switch (itn) {
                    case 1 -> System.out.println("Your bill is ₹:-200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 2 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 3 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 4 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 5 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 6 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 7 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 8 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 9 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    case 10 -> System.out.println("Your bill is ₹:- 200 only.\nThank you Sir/Madam\nPlease visit again");
                    default -> System.out.println("Invalid Input");
                }
            }
            System.out.println("Press 0 to exit\n1 to repeat");
            ch = sc.nextInt();
        } while (ch != 0);
    }
}

