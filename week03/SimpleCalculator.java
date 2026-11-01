import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;

        System.out.println("\n--- CALCULATOR RESULTS ---");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (secondNumber != 0) {
            System.out.println("Division: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        input.close();
    }
}