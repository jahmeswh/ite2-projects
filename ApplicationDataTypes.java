import java.util.Scanner;

public class ApplicationDataTypes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int intValue = input.nextInt();
        System.out.print("Enter a short: ");
        short shortValue = input.nextShort();
        System.out.print("Enter a long: ");
        long longValue = input.nextLong();
         System.out.print("Enter a double: ");
        double doubleValue = input.nextDouble();
        System.out.print("Enter a float: ");
        float floatValue = input.nextFloat();
        System.out.print("Enter a char: ");
        char charValue = input.next().charAt(0);
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = input.nextBoolean();
        System.out.print("Enter a byte: ");
        byte byteValue = input.nextByte();

        System.out.println("You entered int: " + intValue);
        System.out.println("You entered short: " + shortValue);
        System.out.println("You entered long: " + longValue);
        System.out.println("You entered double: " + doubleValue);
        System.out.println("You entered float: " + floatValue);
        System.out.println("You entered char: " + charValue);
        System.out.println("You entered boolean: " + booleanValue);
        System.out.println("You entered byte: " + byteValue);
    }
}
