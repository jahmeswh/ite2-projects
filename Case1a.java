import java.util.Scanner;

public class Case1a
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("Case a: Excellent");
        System.out.println("Case b: Very Good");
        System.out.println("Case c: Good");
        System.out.println("Case d: Poor");
        System.out.println("Case e: Very Poor");
        System.out.println("Case f: Exit");
        System.out.print("Enter your choice [a-f]: ");

        char choice = input.next().charAt(0);

        switch (choice) {
            case 'a':
                System.out.println("Excellent");
                break;
            case 'b':
                System.out.println("Very Good");
                break;
            case 'c':
                System.out.println("Good");
                break;
            case 'd':
                System.out.println("Poor");
                break;
            case 'e':
                System.out.println("Very Poor");
                break;
            case 'f':
                System.out.println("Exit");
                break;
            default:
                System.out.println("Thank you!");
        }
    }
}