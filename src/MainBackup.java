import java.util.Scanner;

public class MainBackup {
    public static void main(String[] args) {

        boolean running = true;

        double tip15 = 0.15;
        double tip20 = 0.20;
        double tip25 = 0.25;
        double tipTotal = 0;

        System.out.println("Hello! Please submit the amount of your tab.");

        while (running) {
            try {

                Scanner scTab = new Scanner(System.in);
                int tab = scTab.nextInt();

                if (tab >= 50 || tab == 300) {
                    tipTotal = tab * tip15;
                } else if (tab >= 300 || tab == 1000) {
                    tipTotal = tab * tip20;
                } else if (tab >= 1000) {
                    tipTotal = tab * tip25;
                } else if (tab == 0) {
                    System.out.println("This program will end now. Bye!");
                    running = false;
                } else if (tab < 0) {
                    System.out.println("This input is invalid. Please submit a number that is not negative.");
                }

                if (running && tab > 0) {
                    int sum = (int) Math.round(tipTotal);

                    System.out.println("Your tip is " + sum + " dollars and the total amount of your tab is " + (tab + sum) + " dollars.");
                    System.out.println("Thank you for using our services. Have a nice day!");
                    running = false;
                }
            } catch (Exception e) {
                System.out.println("We are sorry but something went wrong. Please submit the amount of your tab in numbers.");
            }
        }
    }
}