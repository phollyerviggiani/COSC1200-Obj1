
// Write a Java program to build the Arraylist of elements. {20, 30, 25, 35, -16, 60, -100}. Write code to add 80 in it and remove -16. 
import java.util.ArrayList;

public class assignment2task4 {

    public static void main(String[] args) {

        ArrayList<Integer> AL1 = new ArrayList<Integer>();
        AL1.add(20);
        AL1.add(30);
        AL1.add(25);
        AL1.add(35);
        AL1.add(-16);
        AL1.add(60);
        AL1.add(-100);

        AL1.set(4, 80); // setting the index of -16 to 80

        System.out.println();

        System.out.println("ArrayList (Removed -16, added 80): ");

        for (int i = 0; i < AL1.size(); i++) {
            System.out.println(AL1.get(i));
        }

    }
}