import java.util.Scanner;
public class in_class {

    // Write a program to take in daily step counts and calculate sum and average
    public static void main(String[] args) {
        int [] stepcount = new int[7];
        Scanner scanner = new Scanner(System.in);
        int totalsteps = 0;
        double avg = 0;

       /*  for (int i = 0 ; i < stepcount.length; i++) { // traditional version
        System.out.println("Enter steps for day " + i);
            stepcount[i] = scanner.nextInt();
            totalsteps += stepcount[i];
            

        } // exit loop */

        int [] newstepcount = stepcount;
        newstepcount [6] = 999999;

        for (int j: stepcount) { // iterating version BOTH VERSIONS DO THE SAME THING, just diff ways to do it
            System.out.println("Enter steps for day: ");
            j = scanner.nextInt();
            totalsteps += j;
            
        } // exit loop
        for (int newsteps: newstepcount) { // iterating version BOTH VERSIONS DO THE SAME THING, just diff ways to do it
            System.out.println("Enter new steps for day: ");
            newsteps = scanner.nextInt();
            totalsteps += newsteps;
        }





        
    avg = (totalsteps / 7); 
    System.out.println("Your average steps were: " +  avg);
    System.out.println("Your total steps were: " + totalsteps);

    scanner.close();
}
}