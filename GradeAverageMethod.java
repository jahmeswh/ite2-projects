import java.util.Scanner;

public class GradeAverageMethod
{
    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5.0;
    }

    public static char determineGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
        }

        System.out.println("\nGrades:");
        for (int i = 0; i < 5; i++) {
            char grade = determineGrade(scores[i]);
            System.out.println("Score " + (i + 1) + ": " + scores[i] + " - Grade: " + grade);
        }

        double average = calcAverage(scores[0], scores[1], scores[2], scores[3], scores[4]);
        System.out.println("\nAverage test score: " + average);
    }
}
