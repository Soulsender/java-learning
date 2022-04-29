import java.util.Scanner;


public class robotCoffeeShop {
    public static void main(String[] args) {

        // Initiate user responses
        Scanner user = new Scanner(System.in);

        // Declare variables
        double price = 3.50, tax = 0.5, payment, total;
        String coffee, name;

        // Start visual program
        System.out.println("Hello, welcome to the robot coffee shop! What can I get for you today?");
        coffee = user.next();

        // Calculate tax
        total = price + tax;
        System.out.println("Alright, one " + coffee + " coming right up! That will be $" + price + ", and with tax that's $" + total);
        payment = user.nextDouble();
        System.out.println("Awesome, " + payment + " is enough. Could I get you name?");
        name = user.next();
        System.out.println("Perfect, " + name + " we'll have that ready for you soon.");
        System.out.println("Alright, here's your " + coffee + ", have a nice day!");
    }
}
