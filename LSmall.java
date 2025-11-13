import java.util.Scanner;

public class LSmall
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("The larger number is: " + num1);
            System.out.println("The smaller number is: " + num2);
        } else if (num2 > num1) {
            System.out.println("The larger number is: " + num2);
            System.out.println("The smaller number is: " + num1);
        } else {
            System.out.println("Both are equal: " + num1);
        }
    }
}