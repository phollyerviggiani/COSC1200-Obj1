// Assignment 1: Problem 2 - BurgerShop
// Patrick Hollyer-Viggiani
// 100910706
/* Description: Create a program that lets the user input their name, and the number of burgers
                they wish to purchase. The program will calculate their total based on a fixed
                value for burgers and tax rate, then print their recipt with their name, number
                of burgers, subtotal, tax amount, and grand total.
 */

import java.util.Scanner; // importing scanner

public class BurgerShop { // BurgerShop class setup
    String customerName;
    int burgerNum;

    public void Calculations(String customerName, int burgerNum){ // calculation + print method
        double burgerPrice = 5.99;
        double subTotal = burgerPrice * burgerNum; // subtotal calc
        double taxRate = 0.07;
        double taxAmount = taxRate * subTotal; // tax amount calc
        double grandTotal = subTotal + taxAmount; // grand total calc

        System.out.println("------- Receipt -------");
        System.out.println("Customer Name: " + customerName); // print customer name
        System.out.println("Number of Burgers: " + burgerNum); // print burger number
        System.out.println("Subtotal: " + subTotal); // print subtotal pre tax
        System.out.println("Tax Amount: " + taxAmount); // print tax amount added
        System.out.println("Grandtotal: " + grandTotal); // print grand total
        System.out.println("------------------------");
    }

    public static void main(String[] args) { // main method
        BurgerShop burgers = new BurgerShop(); // adding burgershop class

        Scanner scanner = new Scanner(System.in); // scanner setup

        System.out.print("Please enter your name: "); // prompting user for name input
        String customerName = scanner.nextLine();

        System.out.print("Please enter the number of burgers you wish to purchase: "); // burger num input
        int burgerNum = scanner.nextInt();

        burgers.Calculations(customerName, burgerNum); // calling calculations method

        scanner.close(); // closing scanner
    }
}
