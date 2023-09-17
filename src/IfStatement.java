public class IfStatement {
    public static void main(String[] args) {
       boolean logicTest = false;

       //if then
        if (logicTest) {
            //om logic test = true komm koden här att köras.
            System.out.println("Logic test is true");
        }

        int age = 181;

        if (age == 18) {
            System.out.println("You can go to the pub!");
        } else if (age >= 20) {
            System.out.println("You are allowed to shop at Systembolaget!");
        } else {
            System.out.println("Sorry, you have to wait for a few years to visit the pub and Systembolaget.");
        }
    }
}