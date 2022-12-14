import java.util.Scanner;

public class PhraseRepeaterDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a message: ");
        String msg = keyboard.nextLine();
        System.out.println("Number of times: ");
        int n = keyboard.nextInt();
        
        PhraseRepeater pr = new PhraseRepeater();
        pr.setValues(msg, n);

        System.out.println(pr.getRepeatedPhrase());
    }
}
