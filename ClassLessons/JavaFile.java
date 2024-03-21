import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = input.nextLine();
        File file = new File(filename);

        try {
            file.createNewFile();
            System.out.println("File Created: " + file.getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String text = "This is a test";
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        File folder = new File("C:\\Users\\pvigg\\Documents\\GitHub\\COSC1200-Obj1");
        File newFile = new File(folder, filename);
        System.out.println(newFile);

    }
}
