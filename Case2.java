import java.util.Scanner;

public class Case2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1> Convert Centiliter equivalent to Milliliter (Ml)");
        System.out.println("2> Convert Deciliter equivalent to Centiliter (Cl)");
        System.out.println("3> Convert Liter equivalent to Deciliter (dl)");
        System.out.println("4> Convert Hectoliter equivalent to Deciliter (DL)");
        System.out.println("5> Convert Kiloliter equivalent to Hectoliter (Hl)");
        System.out.println("6> Convert Centiliter equivalent to Milliliter (Ml)");
        System.out.print("Enter your choice [1-6]: ");

        int choice = input.nextInt();
        int num, result;

        switch (choice) {
            case 1:
                System.out.print("Enter the value in Centiliter: ");
                num = input.nextInt();
                result = num * 10;
                System.out.println(num + " Centiliter is equivalent to " + result + " Milliliter.");
                break;
            case 2:
                System.out.print("Enter the value in Deciliter: ");
                num = input.nextInt();
                result = num * 10;
                System.out.println(num + " Deciliter is equivalent to " + result + " Centiliter.");
                break;
            case 3:
                System.out.print("Enter the value in Liter: ");
                num = input.nextInt();
                result = num * 10;
                System.out.println(num + " Liter is equivalent to " + result + " Deciliter.");
                break;
            case 4:
                System.out.print("Enter the value in Hectoliter: ");
                num = input.nextInt();
                result = num * 100;
                System.out.println(num + " Hectoliter is equivalent to " + result + " Deciliter.");
                break;
            case 5:
                System.out.print("Enter the value in Kiloliter: ");
                num = input.nextInt();
                result = num * 10;
                System.out.println(num + " Kiloliter is equivalent to " + result + " Hectoliter.");
                break;
            case 6:
                System.out.print("Enter the value in Centiliter: ");
                num = input.nextInt();
                result = num * 10;
                System.out.println(num + " Centiliter is equivalent to " + result + " Milliliter.");
                break;
            default:
                System.out.println("Not in the Option!");
                break;
        }
    }
}