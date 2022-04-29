import java.util.Scanner;

public class ageMessages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = keyboard.nextInt();

        System.out.println("You are: ");
        if (age < 13) {
            System.out.println("Too young to create a facebook account.");
        }
        if (age < 16) {
            System.out.println("Too young to have a driver's license.");
        }
        if (age < 18) {
            System.out.println("Too young to get a tattoo");
        }
        if (age < 19) {
            System.out.println("Too young to drink alcohol.");
        }
        if (age > 100) {
            System.out.println("Too old!!");
        }
    }
}
