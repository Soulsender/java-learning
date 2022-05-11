import java.util.Scanner;
import java.util.Random;


public class guessing {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int min = 1;
        int max = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(max + min) + min;

        System.out.println("Please guess a number between 1 and 10:");
        int guess = user.nextInt();

        if (randomNumber == guess) {
            System.out.println("You guessed correct!");
        }
        else {
            System.out.println("You were incorrect...");
        }

    }
}
