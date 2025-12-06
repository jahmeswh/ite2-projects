import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		Random rand = new Random();

		int numberToGuess = rand.nextInt(101);
		int userGuess;
		boolean guessedCorrectly = false;

		System.out.println("I'm thinking of a number between 0 and 100. Can you guess it??");

		  while (!guessedCorrectly) {
		            System.out.print("Enter your guess: ");
		            userGuess = input.nextInt();

		            if (userGuess < numberToGuess) {
		                System.out.println("It's Too low! Try again.");
		            } else if (userGuess > numberToGuess) {
		                System.out.println("It's Too high! Try again.");
		            } else {
		                System.out.println("Congrats! Yeyy. You guessed it!!");
		                guessedCorrectly = true;
					}
				}
			}
		}

