import java.util.Scanner;
// initierar Scanner för att kunna ta emot user input

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        // boolean för vår while-loop

        double tip15 = 0.15;
        double tip20 = 0.20;
        double tip25 = 0.25;
        double tipTotal = 0;
        // variabler med värden för att räkna ut tip på input value

        System.out.println("Hello! Please submit the amount of your tab.");

        while (running) {
            try {

                Scanner scTab = new Scanner(System.in); // hämtar och skapar en ny skanner som skall ta emot user input
                int tab = scTab.nextInt(); // variabel tab=user input, som skall vara av datatypen Integer.

                if (tab >= 50 || tab == 300) {
                    tipTotal = tab * tip15;
                } else if (tab >= 300 || tab == 1000) {
                    tipTotal = tab * tip20;
                } else if (tab >= 1000) {
                    tipTotal = tab * tip25;
                } else if (tab == 0) {
                    System.out.println("This program will end now. Bye!");
                    running = false;
                    // om tab är lika med 0 så skall programmet avslutas, därav running=false, eftersom vår while loop är baserad på running=true.
                } else if (tab < 0) {
                    System.out.println("This input is invalid. Please submit a number that is not negative.");
                } // om input value är negativt så körs detta felmeddelande och användaren får skriva in tab igen

                if (running && tab > 0) {
                    int sum = (int) Math.round(tipTotal);
                    // om villkoret running OCH värdet för tab är mindre än 0 så körs nedan kod.

                    System.out.println("Your tip is " + sum + " dollars and the total amount of your tab is " + (tab + sum) + " dollars.");
                    System.out.println("Thank you for using our services. Have a nice day!");
                    running = false;
                }

            } catch (Exception e) {
                System.out.println("We are sorry but something went wrong. Please submit the amount of your tab in numbers.");
            } // try.. catch för att fånga upp felaktig user input
        }
    }
}