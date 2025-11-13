import java.util.Scanner;

public class PRS
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);

        System.out.println("Paper-Rock-Scissor Game");
        System.out.println("============================");
        System.out.print("Player 1 Enter your option (P-R-S)> ");
        String p1 = input.nextLine().toUpperCase();
        System.out.print("Player 2 Enter your option (P-R-S)> ");
        String p2 = input.nextLine().toUpperCase();
        System.out.println("============================");

        if (!isValidChoice(p1) || !isValidChoice(p2)) {
            System.out.println("Result> Invalid!");
            return;
        }

        String fullP1 = getFullName(p1);
        String fullP2 = getFullName(p2);

        if (p1.equals(p2)) {
            System.out.println("Result> " + fullP1 + " vs " + fullP2 + " = It's a tie!");
        } else if ((p1.equals("P") && p2.equals("R")) ||
                   (p1.equals("R") && p2.equals("S")) ||
                   (p1.equals("S") && p2.equals("P"))) {
            System.out.println("Result> " + fullP1 + " vs " + fullP2 + " = " + fullP1 + " wins! Player 1");
        } else {
            System.out.println("Result> " + fullP1 + " vs " + fullP2 + " = " + fullP2 + " wins! Player 2");
        }
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("P") || choice.equals("R") || choice.equals("S");
    }

    private static String getFullName(String abbr) {
        switch (abbr) {
            case "P": return "Paper";
            case "R": return "Rock";
            case "S": return "Scissors";
            default: return "Invalid";
        }
    }
}