import java.util.Scanner;

public class SumLoop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter a positive nonzero integer: ");
        num = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
		}

        System.out.println("The sum of integers from 1 to " + num + " is: " + sum);
    }
}
