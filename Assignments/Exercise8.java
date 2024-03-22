// Patrick Hollyer-Viggiani Exercise 8: Collections
// 100910706

// Imports for arraylist, error handling, and scanner
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// student list class
class StudentList {
    private ArrayList<String> students; // making the arraylist called students

    public StudentList() {
        students = new ArrayList<>();
    }

    // method to add the students
    public void addStudent(String name) {
        students.add(name);
        System.out.println("Student added: " + name);
    }

    // method to remove the students
    public void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // method to display the list of students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("List of Students:");
            for (String student : students) {
                System.out.println(student);
            }
        }
    }

    // method to add the inputs from scanner, referencing the addstudent method
    public void addStudentFromInput(Scanner scanner) {
        System.out.print("Enter student name to add: ");
        String addName = scanner.nextLine().trim();
        if (!addName.isEmpty()) {
            addStudent(addName);
        } else {
            System.out.println("Invalid input: Student name cannot be empty.");
        }
    }

    // method that removes the students based on the scanner, reference the remove student method
    public void removeStudentFromInput(Scanner scanner) {
        System.out.print("Enter student name to remove: ");
        String removeName = scanner.nextLine().trim();
        if (!removeName.isEmpty()) {
            removeStudent(removeName);
        } else {
            System.out.println("Invalid input: Student name cannot be empty.");
        }
    }
}

// Exerecise 8 class, where the main is
public class Exercise8 {
    public static void main(String[] args) {

        // importing the studentlist class and student
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        char choice;

        // do while to prompt the user for input until they want to exit
        do {
            // select 1,2,3,4 depending on what you want to do
            System.out.println("\nPlease select 1, 2, 3, or 4:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // trying to parse the input, if invalid, catching the input with an exception
            try {
                choice = scanner.next().charAt(0);
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case '1':
                        studentList.addStudentFromInput(scanner);
                        break;
                    case '2':
                        studentList.removeStudentFromInput(scanner);
                        break;
                    case '3':
                        studentList.displayStudents();
                        break;
                    case '4':
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                scanner.nextLine(); // Consume invalid input
                choice = '\0'; // Reset choice
            }
        // entering 4 will cancel the loop
        } while (choice != '4');

        // closing scanner
        scanner.close();
    }
}
