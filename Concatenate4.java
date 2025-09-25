import java.util.Scanner;

public class Concatenate4 {
	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		
		String name;
		int score1;
		int score2;
		int score3;
		int score4;
		int score5;
		int Total;
		
		System.out.print("Enter your name: ");
		name = inputDevice.nextLine();
		System.out.print("Enter First Score: ");
		score1 = inputDevice.nextInt();
		System.out.print("Enter Second Score: ");
		score2 = inputDevice.nextInt();
		System.out.print("Enter Third Score: ");
		score3 = inputDevice.nextInt();
		System.out.print("Enter Fourth Score: ");
		score4 = inputDevice.nextInt();
		System.out.print("Enter Fifth Score: ");
		score5 = inputDevice.nextInt();
		
		Total = score1 + score2 + score3 + score4 + score5;
		
		System.out.println("\n--- Sentence ---");
		System.out.println(name + ", a student, got " + score1 + ", " + score2 + ", " + score3 + ", " + score4 + ", " + score5 + " scores, and their total score is " +Total + ".");
		
	}
}