import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi;

        System.out.println("Your height in m: ");
        m = keyboard.nextDouble();

        System.out.println("Your weight in kg: ");
        kg =keyboard.nextDouble();

        bmi = kg / (m*m);

        System.out.println("Your BMI is " + bmi);
    }
}