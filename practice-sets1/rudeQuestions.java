import java.util.Scanner;

public class rudeQuestions {
    public static void main(String[] args) {
        String name;
        int age;
        double weight;

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = keyboard.next();

        System.out.println("Hi, " + name + "! how old are you?");
        age = keyboard.nextInt();

        System.out.println("Ah so you are " + age + "? How much do you weigh?");
        weight = keyboard.nextDouble();

        System.out.println(weight + " huh?");

    }
}
