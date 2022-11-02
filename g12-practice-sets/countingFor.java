import java.util.Scanner;

public class CountingFor {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);

        int n;
        String message;

        System.out.println( "Enter a message and I'll display it five times." );
        System.out.print( "Message: " );

        message = keyboard.nextLine();

        for (n = 1; n <= 5; n++) {
            System.out.println(n + ". " + message);
        }

    }
}