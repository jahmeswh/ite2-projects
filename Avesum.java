import java.util.Scanner;

public class Avesum {
	public static void main(String[] args) {
		
		int num1, num2, Total, Ave;
		
		Scanner inputDevice{ = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1 = inputDevice.nextInt();
		System.out.print("Enter Second Number: ");
		num2 = inputDevice.nextInt();
		Total = num1 + num2;
		System.out.println("The sum is: " +Total);
		Ave = Total / 2;
		System.out.println("The average is: " +Ave);
	}
}