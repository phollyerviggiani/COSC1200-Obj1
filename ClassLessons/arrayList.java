import java.util.Scanner;
import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        System.out.print("Enter the amount of names: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) // iterating num of times entered
            System.out.println("Enter name: " + (i + 1) + ": ");
            names.add(scanner.nextLine());

        System.out.println("Names: " + names); // showing names

        System.out.println("Enter a name to remove: ");
        String deleteName = scanner.nextLine();
        names.remove(deleteName);

        names.add(1, "Patrick");

        System.out.println("New names: " + names);

        scanner.close();





        
    } // end of main
    
} // end of class
