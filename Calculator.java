// Assignment 1: Problem 3 - Calculator
// Patrick Hollyer-Viggiani
// 100910706
/* Description: Create a program that lets the user input two decimal numbers. The program will then
                display the following for the two numbers:
                    Sum
                    Difference
                    Product
                    Quotent
                    Remainder
                The program will then print out the above information to the user.
 */

import java.util.Scanner; // importing scanner

public class Calculator { // calculator class set up
    double num1;
    double num2;

    public static void main(String[] args) { // main method
        Calculator calc = new Calculator(); // adding calculator class

        Scanner scanner = new Scanner(System.in); // scanner set up

        System.out.print("Decimal Number 1: "); // decimal num 1 input
        double num1 = scanner.nextDouble();

        System.out.print("Decimal Number 2: "); // decimal num 2 input
        double num2 = scanner.nextDouble();

        calc.results(num1, num2); // calling results method, passing num1 and num2 in as parameters

        scanner.close(); // closing scanner
    }    

    public void results(double num1, double num2){ // results method, organizing results from calculations
        System.out.println("Sum: " + sum(num1, num2)); // sum result
        System.out.println("Difference: " + difference(num1, num2)); // difference result
        System.out.println("Product: " + product(num1, num2)); // product result
        System.out.println("Quotient: " + quotient(num1, num2)); // quoient result
        System.out.println("Remainder: " + remainder(num1, num2)); // remainder result
    }

    public static double sum(double num1, double num2){ // add method, adds num1 and num2
        return num1 + num2; // returning value
    }

    public static double difference(double num1, double num2){ // difference method, calc difference between num1 and num2
        return num1 - num2; // returning value
    }

    public static double product(double num1, double num2){ // product method, calc product of num1 and num2
        return num1 * num2; // returning value
    }

    public static double quotient(double num1, double num2){ // quotient method, calc quotient of num1 and num2
        return num1 / num2; // returning value
    }

    public static double remainder(double num1, double num2){ // remainder method, finding remainder when modulo num1 and num2
        return num1 % num2; // returning value
    }
}