import java.util.Scanner; // imports the scanner function/class

class InputPrint{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // Creates the scanner object
        System.out.println("Enter your name: "); // Print Line
        String name = scanner.nextLine(); //take the user input
        System.out.println("Hello my name is " + name + ", Welcome to Object Oriented Programming (OOP)"); // displaying output
        scanner.close(); // closing scanner
    }
}