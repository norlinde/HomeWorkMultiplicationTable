import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
Calculations calculations = new Calculations();

    public void showHomeScreen() {
        String option = "";
        do {
            System.out.println("\nWelcome to Multiplication Table programme! ");

            System.out.println("Press -  1 / to choose which numbers and how many times to multiply .");
            System.out.println("Press -  2 / to see Fixed Multiplication Table. ");
            System.out.println("OR.....just write exit to EXIT! ");
            System.out.println("Write the number here: ");
            option = scanner.nextLine();

            switch (option) {
                case "2":
                    calculations.fixedMultiplicationTable();
                    break;
                case "1":
                    calculations.multiplicationTable();
                    break;
                case "exit":
                    System.out.println("Have a great day");
                default:
                    break;
            }
        }
        while (!option.toLowerCase().equals("exit"));
        return;
    }
}
