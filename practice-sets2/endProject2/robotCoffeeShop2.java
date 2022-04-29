
//
// An upgraded version of the first robot coffee shop I made.
//

// User input
import java.util.Scanner;

// Thread timer
import java.lang.Thread;

// Main Class
public class robotCoffeeShop2 {
    public static void main(String[] args) {

        // Initiate user responses
        Scanner user = new Scanner(System.in);

        // Declare variables
        double price = 0, tax = 0.2, payment, total, change;
        String name;
        boolean enoughPayment;
        String coffee;

        // Start visual program
        System.out.println("Hello, welcome to the robot coffee shop! What can I get for you today?");
        coffee = user.nextLine();

        // What kind of coffee?
        // I tried using coffee == "americano" but this doesn't really work for strings because it compares things by reference.
        // Check what coffee the user ordered. If it is an unknown string, integer, double, etc., then exit the program. 
        if (coffee.equals("americano")) {
            price = 2.50;
        }
        else if (coffee.equals("cappucino")) {
            price = 3.00;
        }
        else if (coffee.equals("frappucino")) {
            price = 4.50;
        }
        else {
            System.out.println("Sorry, we don't serve " + coffee + " here...");
            System.exit(0);
        }

        // Calculate tax
        tax = price * tax;
        total = price + tax;

        // Print coffee, payment, and tax total.
        System.out.println("Alright, one " + coffee + " coming right up! That will be $" + price + ", and with tax that's $" + total + ". You can hand me your money now.");

        // Get payment from user
        payment = user.nextDouble();

        // Check if payment is enough, and if it is, then return the change. If not, exit the program.
        if (payment >= total) {
            change = payment - total;
            System.out.println("Awesome, " + payment + " is enough. Your change is " + change);
        }
        else {
            System.out.println("Looks like you are out of cash! Sorry!");
            System.exit(0);
        }

        // Get user name and say it back to them.
        System.out.println("Could I get your name?");
        name = user.next();
        System.out.println("Perfect, " + name + " we'll have that ready for you soon.");

        // Imitate a 5 second timer, as if the coffee was being made.
        try {
           Thread.sleep(5000);
        }
        catch(Exception e) {
          System.out.println(e);
        }

        // Print the coffee and name to confirm the order.
        System.out.println("Alright, here's your " + coffee + ", " + name + " have a nice day!");

        // Are you the lucky first customer?
        double luckyWinner = Math.random();
        if (luckyWinner < 0.1) {
            System.out.println("We have a lucky winner! You are our very first customer! Congratulations!");
        }
        else {
            System.out.println("Unfortunately you are only our second customer, so you didn't win anything. How sad.");
        }

        



    }
}
