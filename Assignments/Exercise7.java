// Patrick Hollyer-Viggiani Exercise 7: Exception Handling
// 100910706

// DividebyZero class, int numerator and demoninator
class DividebyZero {
    int numerator;
    int demoninator;

    // constructor DividebyZero
    public DividebyZero(int numerator, int demoninator){
        this.numerator = numerator;
        this.demoninator = demoninator;
    }

    // divide method dividing numerator by demoninator
    public void divide() {
        try {
            int result = numerator / demoninator;
            System.out.println("Result: " + result);
        
        // catch the arithmetic error and print the following
        } catch (ArithmeticException e) {
            System.out.println("Error! Cannot divide by 0");
        }
    }
}

// exercise7 class where the main is 
public class Exercise7 {
    public static void main(String[] args) {
        // adding the dividebyzero class, calling the divide method, passing 10 and 0 to catch the exception
        DividebyZero division = new DividebyZero(10,0);
        division.divide();
    }
}
