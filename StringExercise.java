// String Exercise
// Patrick Hollyer-Viggiani 100910706
// February 16, 2024

public class StringExercise {
    public static void main(String[] args) {

        // Original String
        String s1 = "Java is Awesome!";
        System.out.println("Original String: " + s1);

        // 1. QUESTION: WHAT IS THE CHARACTER AT INDEX 5 IN THE STRING "JAVA IS
        // AWESOME!"? (USE THE CHARAT() METHOD)
        char output = s1.charAt(5);
        System.out.println("\nThe character at index 5 is: " + output); // will print "i"

        // 2. QUESTION: HOW MANY CHARACTERS ARE THERE IN THE STRING "JAVA IS AWESOME!"?
        // (USE THE LENGTH() METHOD)
        int s1length = s1.length();
        System.out.println("The length of the string is: " + s1length);

        // 3. QUESTION: WHAT IS THE SUBSTRING STARTING FROM INDEX 5 IN THE STRING "JAVA IS
        // AWESOME!"? (USE THE SUBSTRING() METHOD:
        String s1sub = s1.substring(5);
        System.out.println("Substring starting at 5: " + s1sub);

        // 4. QUESTION: AT WHICH INDEX DOES THE SUBSTRING "IS" FIRST OCCUR IN THE STRING "JAVA IS
        // AWESOME!"?( USE THE INDEXOF() METHOD:
        int indexOfIs = s1.indexOf("is");
        System.out.println("'is' occured at index: " + indexOfIs);

        // 5. QUESTION: CONVERT THE STRING "JAVA IS AWESOME!" TO UPPERCASE. (USE THE
        // TOUPPERCASE() METHOD)
        String s1Upper = s1.toUpperCase();
        System.out.println("Upper Case: " + s1Upper);

        // 6. QUESTION: CONVERT THE STRING "JAVA IS AWESOME!" TO LOWERCASE. (USE THE
        // TOLOWERCASE() METHOD)
        String s1Lower = s1.toLowerCase();
        System.out.println("Lower Case: " + s1Lower);

        // 7. QUESTION: REPLACE THE WORD "AWESOME" WITH "AMAZING" IN THE STRING "JAVA IS
        // AWESOME!". (USE THE REPLACE() METHOD)
        String s1Replace = s1.replace("Awesome", "Amazing");
        System.out.println("Replaced String: " + s1Replace);

    }   
}
