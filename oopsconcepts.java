public class oopsconcepts {
    public static void main(String args[]){ // creating a NEW instance of student
        Student student = new Student("Patrick", 20);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        student.setName("Pat");
        student.setAge(22);

        System.out.println("New Name: " + student.getName());
        System.out.println("New Age: " + student.getAge());

        Student student2 = new Student("Mikala", 19);

        // Print the updated information
        System.out.println("Student 2 Name: " + student2.getName());
        System.out.println("Student 2 Age: " + student2.getAge());

    }
}
