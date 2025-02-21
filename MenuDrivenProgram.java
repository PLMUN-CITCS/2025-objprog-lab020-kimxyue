import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Loop to repeatedly show the menu and process user choices
        while (true) {
            displayMenu(); // Display the menu
            choice = scanner.nextInt(); // Get user's choice

            if (handleMenuChoice(choice)) {
                break; // Exit the loop if the user chooses to exit
            }
        }

        scanner.close(); // Close the scanner
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle the menu choice
    public static boolean handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in); // Scanner object for user input

        switch (choice) {
            case 1:
                greetUser(); // Call the greetUser() method
                break;

            case 2:
                checkEvenOrOdd(scanner); // Call the checkEvenOrOdd() method
                break;

            case 3:
                System.out.println("Exiting program. Goodbye!"); // Exit message
                return true; // Exit the loop

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
        return false; // Do not exit the loop
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if the number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Get user input
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}