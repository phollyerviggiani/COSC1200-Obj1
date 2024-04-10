/* 
Name: Patrick Hollyer-Viggiani
Student Number: 100910706
Date: April 12, 2024
File Name: oopsProject.java
Description: Create a Java program that enables the function of multiple library management features. 
             These features include, entering a book, customer, having an inventory, and displaying the user order.
*/

// Imports
import java.util.*;

// Book class - book in the bookstore
class Book {
    private int id;
    private String title;
    private String ISBN;
    private String author;
    private String publisher;
    private double price;
    private int quantity;

    // Book Class constructor
    public Book(int id, String title, String ISBN, String author, String publisher, double price, int quantity) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for book class
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// Customer class - customer taking out a book
class Customer {
    private String name;
    private String email;
    private String phoneNumber;

    // Customer constructor
    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters for customer class
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// Order Class - when a customer makes an order
class Order {
    private int orderId;
    private static Random random = new Random();
    private Customer customer;
    private List<Book> books;
    private Date date;

    // Order constructor
    public Order(Customer customer) {
        this.orderId = random.nextInt(100000000);
        this.customer = customer;
        this.books = new ArrayList<>();
        this.date = new Date();
    }

    // Add book + quantity to the order
    public void addBook(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            books.add(book);
        }
    }

    // Calculate total order amount
    public double calculateTotal() {
        double totalAmount = 0.0;
        for (Book book : books) {
            totalAmount += book.getPrice();
        }
        return totalAmount;
    }

    // Generate the recpipt
    public void printReceipt() {
        System.out.println("-------------------------");
        System.out.println("        BOOKSTORE        ");
        System.out.println("       Order Receipt     ");
        System.out.println("-------------------------");
        System.out.println("Order ID: " + orderId);
        System.out.println("Date: " + date);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        System.out.println("Customer Phone Number: " + customer.getPhoneNumber());
        System.out.println("Books Purchased: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book " + (i + 1) + " - $" + books.get(i).getPrice());
        }
        System.out.println();
        System.out.println("Total Quantity: " + books.size());
        System.out.println("Total Price: $" + calculateTotal());
        System.out.println("-------------------------");
        System.out.println("        Thank you!       ");
        System.out.println("-------------------------");
    }
}

// Inventory class - manages the inventory
class Inventory {
    private List<Book> books;

    // Inventory Constructor
    public Inventory() {
        this.books = new ArrayList<>();
    }

    // Add a new book to the inventory
    public void addBook(Book book) {
        books.add(book);
    }

    // Update the quantity of books in the inventory
    public void updateBookQuantity(int bookId, int quantity) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                book.setQuantity(book.getQuantity() + quantity);
                break;
            }
        }
    }

    // Find book by ID
    public Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Checking if there are enough books in stock
    public boolean inStock(int bookId, int quantity) {
        Book book = findBookById(bookId);
        if (book == null) {
            return false;
        }
        return book.getQuantity() >= quantity;
    }

    // Generate inventory report
    public void printInventory() {
        System.out.println("-------------------------");
        System.out.println("        INVENTORY        ");
        System.out.println("-------------------------");
        for (Book book : books) { // printing out the book's information
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor()
                    + ", Publisher: " + book.getPublisher() + ", ISBN: " + book.getISBN() + ", Quantity: "
                    + book.getQuantity());
        }
        System.out.println("-------------------------");
    }
}

// oopsProject class, where the main function is located
public class oopsProject {
    public static void main(String[] args) {
        // Adding the inventory class functionality
        Inventory inventory = new Inventory();
        // Scanner to allow for input which lets the user select a given book
        Scanner scanner = new Scanner(System.in);

        // Adding books to the arraylist
        inventory.addBook(new Book(1, "GreatBook 1", "ISBN111", "Author 1", "Publisher 1", 19.99, 12));
        inventory.addBook(new Book(2, "GreatBook 2", "ISBN222", "Author 2", "Publisher 2", 13.99, 10));
        inventory.addBook(new Book(3, "GreatBook 3", "ISBN333", "Author 3", "Publisher 3", 15.99, 20));
        inventory.addBook(new Book(4, "Cool Book 4", "ISBN444", "Author 4", "Publisher 4", 29.99, 15));
        inventory.addBook(new Book(5, "Cool Book 5", "ISBN555", "Author 5", "Publisher 5", 24.99, 18));
        inventory.addBook(new Book(6, "Average Book 6", "ISBN666", "Author 6", "Publisher 6", 10.99, 30));
        inventory.addBook(new Book(7, "Average Book 7", "ISBN777", "Author 7", "Publisher 7", 9.99, 7));
        inventory.addBook(new Book(8, "Best Book 8", "ISBN888", "Author 8", "Publisher 8", 40.99, 5));
        inventory.addBook(new Book(9, "Best Book 9", "ISBN999", "Author 9", "Publisher 9", 40.99, 14));
        inventory.addBook(new Book(10, "Sad Book 10", "ISBN101010", "Author 10", "Publisher 10", 11.99, 21));
        inventory.addBook(new Book(11, "Happy Book 11", "ISBN111111", "Author 11", "Publisher 11", 17.99, 8));
        inventory.addBook(new Book(12, "Scary Book 12", "ISBN121212", "Author 12", "Publisher 12", 22.99, 9));


        // Choice option to let the user pick 1, 2, 3, or 4 depending on what they want to do
        String choice;
        // While loop to prompt the user for input until they enter a desired response
        while (true) {
            System.out.println("-------------------------");
            System.out.println("  Welcome to Bookstore!  ");
            System.out.println("-------------------------");
            System.out.println("1. Search for book");
            System.out.println("2. Make a purchase");
            System.out.println("3. Print inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine(); // taking in their input

            // If the user enters "1", let them search for a specific book's ID
            if (choice.equals("1")) {
                System.out.print("Enter the book's ID to search: "); // enter an ID
                String input = scanner.nextLine();
                int searchId = 0;

                // Using a try/catch to verify if the user entered an int
                try {
                    searchId = Integer.parseInt(input);
                
                // If the user did NOT enter an int, display the error
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    return;
                }

                // If input was an int, earch for the book based on the id, using the findBookById method
                Book searchedBook = inventory.findBookById(searchId);
            
                // If ID the entered was not valid, say book not found
                if (searchedBook == null) {
                    System.out.println("Book not found.");
                
                // ID = valid --> display the book's information
                } else {
                    System.out.println("Book found!");
                    System.out.println("ID: " + searchedBook.getId() + ", Title: " + searchedBook.getTitle()
                            + ", Author: " + searchedBook.getAuthor()
                            + ", Publisher: " + searchedBook.getPublisher() + ", ISBN: " + searchedBook.getISBN()
                            + ", Quantity: "
                            + searchedBook.getQuantity());
                }
            
            // If user enters "2", let them purchase a book.
            } else if (choice.equals("2")) {

                // Following lines let the user enter name, email, and phone number - then passes it through via customer using the given input
                System.out.print("Please enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.print("Please enter your phone number: ");
                String phoneNumber = scanner.nextLine();
                Order order = new Order(new Customer(name, email, phoneNumber));
                boolean purchaseComplete = true;
            
                // While loop set to true prompt user for book information
                while (true) {
                    System.out.print("Enter book id: ");
                    String input = scanner.nextLine();
                    int orderBookId = 0;

                    // If the user did not enter an int for either book ID or quantity, bring them back to this statement and wait for an int
                    try {
                        orderBookId = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }

                    // If the user enters a valid int, try and find the id in the books list
                    Book book = inventory.findBookById(orderBookId);
                    
                    // If the book is not in the list, say book not found.
                    if (book == null) {
                        System.out.println("Book not found in inventory.");
                        purchaseComplete = false;
                        break;
                    }
            
                    // If book is found, ask them how many they would like to purchase.
                    System.out.print("Enter quantity to purchase: ");
                    input = scanner.nextLine();
                    int orderQuantity = 0;

                    // If the quantity is not an int, the user will be brought back to the ID selection part
                    try {
                        orderQuantity = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                    }
            
                    // If the user entered an amount that is over the quantity, tell them there are not enough books in stock
                    if (!inventory.inStock(orderBookId, orderQuantity)) {
                        System.out.println("Not enough books in stock.");
                        purchaseComplete = false;
                        break;
                    }
            
                    // If all inputs prior were valid, subtract the quantity they endered from the total quantity and add it to their order
                    inventory.updateBookQuantity(orderBookId, -orderQuantity);
                    order.addBook(book, orderQuantity);
            
                    // Ask the user if they want to enter more books
                    // If "N" or "n", print out the print the users receipt
                    System.out.print("Enter another book? Y/N: ");
                    String proceed = scanner.nextLine();

                    // If the user does not enter Y or N, ask tell them they must enter "Y" or "N" (case does not matter)
                    while (!proceed.equalsIgnoreCase("Y") &&!proceed.equalsIgnoreCase("N")) {
                        System.out.println("Invalid input. Please enter Y or N.");
                        System.out.print("Enter another book? Y/N: ");
                        proceed = scanner.nextLine();
                    }
                    if (proceed.equalsIgnoreCase("N")) {
                        break;
                    }
                }
            
                // Once the user enters "N" or "n", their receipt will be printed
                if (purchaseComplete) {
                    order.printReceipt();
                }

            // If the user enters "3", the entire inventory will print
            } else if (choice.equals("3")) {
                inventory.printInventory();
                
            // If the user enters "4", the system will close
            } else if (choice.equals("4")) {
                System.out.println("Exiting the application....");
                scanner.close();
                System.exit(0);

            // If the user enters anything other than 1, 2, 3, or 4, they will get the following message, and be asked for input again
            } else {
                System.out.println("Invalid input. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
