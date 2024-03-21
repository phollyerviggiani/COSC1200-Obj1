public class oops_concepts {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student("John","Smith", 20);

        // Access the methods
        System.out.println("First Name: " + student.getName());
        System.out.println("Last Name: " + student.getLastname());
        System.out.println("Age: " + student.getAge());

        // Modify the student's information
        Student student2 = new Student("Melissa", "Smith", 19);

        // Print the updated information
        System.out.println("Student 2 First Name: " + student2.getName());
        System.out.println("Student 2 Last Name: " + student2.getLastname());
        System.out.println("Student 2 Age: " + student2.getAge());
    }
}