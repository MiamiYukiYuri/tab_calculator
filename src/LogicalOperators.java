public class LogicalOperators {
    public static void main(String[] args) {
        int testNumberOne = 50;

      /*  if (testNumberOne < 100) {
            System.out.println("Test number is less than 100");
        } */

        int testNumberTwo = 100;
        //OCH-operatorn
        // kolla om test 1 är större än test 2 samt om test 1 är mindre än 100
        if (testNumberOne > testNumberTwo && testNumberOne < 100) {
            System.out.println("Test number one is greater than test number two");
        }

        //ELLER-operatorn
        if (testNumberOne > 90 || testNumberTwo <= 90) {
            System.out.println("Either or both conditions are true");
        }
    }
}
