import java.util.Arrays;

public class arraysinclass {
    
    public static void main(String[] args) {
        
        int[] array1 = new int[5]; // making blank array with a length of 5
        //int[] array2 = {6,7,8,9,10}; // array 2 with predefined values

        Arrays.fill(array1, 0, 3, 100); // filling index 0-2 with val of 100

        printArray(array1);

        /*for (int i: array1) // one way of for loop (for each)
            System.out.println(i + " ");

        for (int x = 0; x < array1.length; x++) // for loop indexing
            System.out.println(array1[x]); */

       


    }

    public static void printArray(int[] array1) {
        for (int x = 0; x < array1.length; x++) // for loop indexing
        System.out.println(array1[x]);
    }
}
