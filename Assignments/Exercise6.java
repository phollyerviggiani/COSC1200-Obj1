// Patrick Hollyer-Viggiani Exercise 6: File Handling - Reading
// 100910706

// imports of file reader + exception handling
import java.io.FileReader;
import java.io.IOException;

// readfromfile class
class ReadFromFile {

    // readDatafromfile method
    public void readDataFromFile(String fileName) {

        // trying to read the data from the file
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            System.out.println("Data read from the file:");
            // while look to loop through each character and print it out until there are none (-1)
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        
        // exception handling 
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

// exercise 6 class, where main is
public class Exercise6 {
    public static void main(String[] args) {
        // calling readfromfile class + readdatafromfile method passing in the previous textfile we made in exercise 5
        ReadFromFile fileReader = new ReadFromFile();
        fileReader.readDataFromFile("Exercise_5_6.txt");
        }
    }
