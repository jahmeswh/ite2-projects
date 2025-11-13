import java.util.Scanner;

public class OEven
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        String parity = (age % 2 == 0) ? "even" : "odd";

        System.out.println(name + "! Your age " + age + " is an " + parity + " number.");
	}
}