// Assignment 1: Problem 1 - Person Class
// Patrick Hollyer-Viggiani
// 100910706
/* Description: Adding a Java class called 'Person' that contains a name(String), age(int),
                gender(char). Person class contains getter/setter, a constructor that initializes 
                all variables, and method called 'introduce', which introduces the user's input.
*/

import java.util.Scanner; // importing scanner

public class Person { // person class settup
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){ // constructor initialize
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getters and setters for all variables
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
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
    }

    // main method
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your name: "); 
        String name = input1.nextLine();
        
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input2.nextInt();
        
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter your gender (M/F): "); 
        char gender = input3.next(".").charAt(0);

        // adding person class to main
        Person person = new Person(name, age, gender);

        person.setName(name);
        person.setAge(age);
        person.setGender(gender);

        // calling introduce method
        person.introduce();

        // closing scanner
        input1.close();
        input2.close();
        input3.close();
    }
    
}
