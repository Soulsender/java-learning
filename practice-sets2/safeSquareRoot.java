import java.util.Scanner;

public class safeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;

        System.out.println("Give me a number, and I'll find it's square root.");
        System.out.println("(No negatives please)");
        x = keyboard.nextDouble();

        while (x < 0) {
            System.out.println("I won't take the square too of a negative.");
            System.out.println("\nNew Number: ");
            }

        y = Math.sqrt(x);

        System.out.println("The square root of " + x + " is " + y);

    }
}
