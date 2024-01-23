// Lab 1: Hello World
// Patrick Hollyer-Viggiani
// 100910706
// Program Description: Making a program that takes user name and age, then prints out a message
// accordinging to their age. It finishes by telling the user how close to retirement (65) they are


import java.util.Scanner;

class ConditionalPrint {
    public static void main(String args[]) { 
        Scanner scanner = new Scanner(System.in); // making the scanner objects to take string and int
        System.out.println("Enter your name: "); 
        String name = scanner.nextLine(); 
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner2.nextInt(); // conditions to check the age, printing appropriate response
            if (age < 25) {
                System.out.println("Hello " + name + ", you are " + age + ", welcome to OOPS at Durham! Learning at such a young age!");
                
            }
            else if(age >= 25 && age < 46 ) {
                System.out.println("Hello " + name + ", you are " + age + ", Durham College welcomes you to OOPS! You are at the perfect age to learn!");
            }
            else if(age >= 45 && age < 61 ) {
                System.out.println("Hello " + name + ", you are " + age + ", welcome to Object Oriented Programming, it's never to late to start!");
            }
            else if (age > 60) {
                System.out.println("Hello " + name + ", you are " + age + ", I hope you are enjoying Durham College and OOPS, always great to learn a new skill!");
            }
        
        int agegap = 65 - age; // calculating years until retirement
        if (age < 65) { // if under 65, printing age til retirement
            System.out.println("You are " + agegap + " years away from retirement!");
        }
        else {
            System.out.println("Congrats! You are already retired!"); 
        }
        scanner.close(); //closing both scanners
        scanner2.close();
    }
}