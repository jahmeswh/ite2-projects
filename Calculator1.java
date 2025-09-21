import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        double sum = num1 + num2;
        double average = sum / 2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}