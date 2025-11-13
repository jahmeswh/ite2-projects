import java.util.Scanner;

public class Case1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1 - Welcome to Java");
        System.out.println("2 - Topdown");
        System.out.println("3 - Decision");
        System.out.println("4 - Iteration");
        System.out.println("5 - Function / Procedure");
        System.out.println("6 - Exit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1 - Welcome to Java");
                break;
            case 2:
                System.out.println("2 - Topdown");
                break;
            case 3:
                System.out.println("3 - Decision");
                break;
            case 4:
                System.out.println("4 - Iteration");
                break;
            case 5:
                System.out.println("5 - Function / Procedure");
                break;
            case 6:
                System.out.println("6 - Exit");
                break;
            default:
                System.out.println("Thank you!");
        }
    }
}