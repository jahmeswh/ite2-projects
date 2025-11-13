   import java.util.Scanner;

public class PFailed2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter first score: ");
        double S1 = input.nextDouble();
        System.out.print("Enter second score: ");
        double S2 = input.nextDouble();
        System.out.print("Enter third score: ");
        double S3 = input.nextDouble();

        double average = (S1 + S2 + S3) / 3;

        System.out.println("Hello! " + name + ", your average score is " + average);

        if (average >= 75) {
            System.out.println("You Passed! :P");
        } else {
            System.out.println("You Failed. :(");
        }
    }
}