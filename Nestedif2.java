import java.util.Scanner;

public class Nestedif2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        int grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println(" A  Excellent");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println(" B  Very Good");
        } else if (grade >= 75 && grade <= 79) {
            System.out.println(" C  Good");
        } else if (grade >= 70 && grade <= 74) {
            System.out.println(" D  Poor");
        } else if (grade >= 0 && grade < 70) {
            System.out.println(" E  Very Poor");
        } else {
            System.out.println("Invalid grade.");
        }
    }
}