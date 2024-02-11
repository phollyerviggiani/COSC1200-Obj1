import java.util.Scanner;

public class classwork {

    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students? ");
        N = scanner.nextInt();

        double[][] studentmarks = new double[N][3];
        double[] totalstudentmarks = new double[N];
        double totalmarksclass = 0.0;

        for (int i = 0; i < studentmarks.length; i++) {
            System.out.println("Enter Marks for Student: ");

            for (int j = 0; j < studentmarks[0].length; j++) {
                studentmarks[i][j] = scanner.nextDouble();
                totalstudentmarks[i] += studentmarks[i][j];
            }

            totalmarksclass += totalstudentmarks[i];
        }

        for (double[] row : studentmarks) {
            for (double element : row) {
                System.out.println(element + " ");
            }

        System.out.println("The total marks for student are: " + totalmarksclass);
        }
        scanner.close();
    }

}
