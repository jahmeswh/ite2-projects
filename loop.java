import java.util.Scanner;

public class loop
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.print("Enter a number on how many times to list: ");
		num = input.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("\nWelcome to Java!");
		}
	}
}
