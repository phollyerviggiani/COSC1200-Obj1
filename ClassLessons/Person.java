// Assignment 1: Problem 1 - Person Class
// Patrick Hollyer-Viggiani
// 100910706
/* Description: Adding a Java class called 'Person' that contains a name(String), age(int),
                gender(char). Person class contains getter/setter, a constructor that initializes 
                all variables, and method called 'introduce', which introduces the user's input.
*/

import java.util.Scanner; // importing scanner

public class Person { // person class setup
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){ // constructor initialization
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getters and setters for name, age, and gender variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    // introduce method that displays the users input
    public void introduce() {
        System.out.println("Name: " + getName()); // print out user name
        System.out.println("Age: " + getAge()); // print out user age
        System.out.println("Gender: " + getGender()); // print out user gender
    }

    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // scanner setup

        System.out.print("Enter your name: ");  // take user name input
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: "); // take user age input
        int age = scanner.nextInt();
        
        System.out.print("Enter your gender (M/F): "); // take user gender input
        char gender = scanner.next(".").charAt(0);

        // adding person class to main
        Person person = new Person(name, age, gender);

        person.setName(name); // setting input to name
        person.setAge(age); // setting input to age
        person.setGender(gender); // setting input to gender

        // calling introduce method to print user info
        person.introduce();

        // closing scanner
        scanner.close();
    }
}
