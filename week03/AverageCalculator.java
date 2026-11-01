import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first score: ");
        double firstScore = input.nextDouble();

        System.out.print("Enter second score: ");
        double secondScore = input.nextDouble();

        System.out.print("Enter third score: ");
        double thirdScore = input.nextDouble();

        double total = firstScore + secondScore + thirdScore;
        double average = total / 3;

        System.out.println("\n--- STUDENT SCORE SUMMARY ---");
        System.out.println("Total Score: " + total);
        System.out.println("Average Score: " + average);

        input.close();
    }
}