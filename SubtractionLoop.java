import java.util.Scanner;
import java.util.Random;

public class SubtractionLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int correctCount = 0;
        String[] results = new String[5];

        System.out.println("Answer the following (5) subtraction questions:");

        for (int i = 0; i < 5; i++) {
            int a = rand.nextInt(50) + 1;
            int b = rand.nextInt(a) + 1;

            System.out.print("Q" + (i + 1) + ": " + a + " - " + b + " = ");
            int userAnswer = input.nextInt();
            int correctAnswer = a - b;

            String status;
            if (userAnswer == correctAnswer) {
                status = "Correct";
                correctCount++;
            } else {
                status = "Wrong (Correct answer: " + correctAnswer + ")";
            }

            results[i] = "Q" + (i + 1) + ": " + a + " - " + b + " = " + userAnswer + " - " + status;
        }

        System.out.println("\nYou got " + correctCount + " out of 5 correct.");

        System.out.println("\nResults:");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
