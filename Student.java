// Lab 2
// Patrick Hollyer-Viggiani
// 100910706
// Description: Adding elements to the Student class, setting parameters for the input.

import java.util.Scanner;

public class Student {
    private String name;
    private String lastname;
    private int age;

    public Student(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastName(String lastname) {
        if ((lastname == "")){
            System.out.println("Must have a last name.");
            return;
        }
        else{}
        this.lastname = lastname;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            System.out.println("Invalid Age! Enter age between 1-99.");
            return;
        }
        else{}
        this.age = age;
    }


    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = "No Name Inputted, Must have a last name!";
        this.age = 0;
        
        }

    public static void main(String args[]) {
        Student student1 = new Student("", "");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: "); 
        String name = scanner.nextLine();
        student1.setName(name);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastname = scanner2.nextLine();
        student1.setLastName(lastname);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner3.nextInt();
        student1.setAge(age);
        
    
        System.out.println("First Name: " + student1.getName());
        System.out.println("Last Name: "+ student1.getLastname());
        System.out.println("You are " + student1.getAge());

        scanner.close();
        scanner2.close();
        scanner3.close();
        
    }
}