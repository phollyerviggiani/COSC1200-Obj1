// Write a Java program that takes integers in an array of size N and write a function that returns 
// the square values of the array. 
// Sort this array in ascending order and print the sorted array. 
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Num amount?:  ");
        int N = scanner.nextInt();

        int[] A1 = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A1[i] = scanner.nextInt();
        }

        int[] squaredA = squareArray(A1);
        Arrays.sort(squaredA);
        System.out.println("Squared Array:");
        printArr(squaredA);
        scanner.close();

    }

    public static int[] squareArray(int[] A1) {
        int[] squaredA1 = new int[A1.length];
        for (int i = 0; i < A1.length; i++) {
            squaredA1[i] = A1[i] * A1[i];
        }
        return squaredA1;
    }

    public static void printArr(int[] A1) {
        for (int i = 0; i < A1.length; i++) {
            System.out.print(A1[i] + " ");
        }
    }

}
