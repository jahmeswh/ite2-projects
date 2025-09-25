import java.util.Scanner;

public class Concatenate2 {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        String name;
        int age;
        String gender;
        String address;
        String program;

        System.out.print("Enter your name: ");
        name = inputDevice.nextLine();

        System.out.print("Enter your age: ");
        age = inputDevice.nextInt();
        inputDevice.nextLine(); 

        System.out.print("Enter your gender: ");
        gender = inputDevice.nextLine();

        System.out.print("Enter your address: ");
        address = inputDevice.nextLine();

        System.out.print("Enter your course/program: ");
        program = inputDevice.nextLine();
        
        System.out.println("\n--- Biodata Summary ---");
        System.out.println("My name is " + name + ", I am " + age + " years old," + "a " + gender + ", living at " + address + ", and I am currently taking " + program + ".");
    }
}