import java.util.Scanner;

public class Nestedif1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int score = input.nextInt();

        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else {
            if (score >= 80 && score <= 89) {
                grade = "B";
            } else {
                if (score >= 75 && score <= 79) {
                    grade = "C";
                } else {
                    if (score >= 70 && score <= 74) {
                        grade = "D";
                    } else {
                        grade = "E";
                    }
                }
            }
        }

        System.out.println("Grade: " + grade);
    }
}