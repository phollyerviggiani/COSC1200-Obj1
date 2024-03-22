// Patrick Hollyer-Viggiani Exercise 5: File Handling - Writing
// 100910706

// imports for filewriting + inputs + exception handling
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// class writeto data
class WritetoData {

    // method for writing data into a file
    public void writeDataToFile(String fileName) {
        Scanner input = new Scanner(System.in); // scanner taking in the input
        try {
            FileWriter writer = new FileWriter(fileName); // making a filewriter instance

            // enter the text you want to write in to a file
            System.out.println("Enter text to write to the file:"); 
            String line = input.nextLine();

            // writing the input in to the file
            writer.write(line);
            writer.close();
            System.out.println("Data written in to file.");

        // error handling + close scanner
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}

// exercise 5 class where the main is
public class Exercise5 {
    public static void main(String[] args) {
        // calling writetodata class + writedatatofile method
        WritetoData fileWriter = new WritetoData();
        fileWriter.writeDataToFile("Exercise_5_6.txt");
    }
}
