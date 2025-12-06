import java.util.Scanner;

public class password
{
	public static boolean isValidPassword(String password)
	{
		if (password.length() < 8)
		{
            return false;
        }
        if (!password.matches("[a-zA-Z0-9]+"))
        {
            return false;
            }

            int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2)
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
