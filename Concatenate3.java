import java.util.Scanner;

public class Concatenate3 {
	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		
		String name;
		int score1;
		int score2;
		int score3;
		
		System.out.print("Enter your name: ");
		name = inputDevice.nextLine();
		System.out.print("Enter First Score: ");
		score1 = inputDevice.nextInt();
		System.out.print("Enter Second Score: ");
		score2 = inputDevice.nextInt();
		System.out.print("Enter Third Score: ");
		score3 = inputDevice.nextInt();
		
		System.out.println("\n--- Sentence ---");
		System.out.println(name + ", a student, got " + score1 + ", " + score2 + ", " + score3 + " scores.");
	}
}