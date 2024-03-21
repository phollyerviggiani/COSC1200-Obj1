public class ScopeExample {
    // Global variable
    private int x = 10;

    public void method1() {
        // Local variable with the same name as the global variable
        int x = 20;
        System.out.println("Local x: " + x); // Accessing local variable
        System.out.println("Global x: " + this.x); // Accessing global variable using "this" keyword
    }

    public void method2() {
        // Local variable with the same name as the global variable
        int x = 30;
        System.out.println("Local x: " + x); // Accessing local variable
        System.out.println("Global x: " + this.x); // Accessing global variable using "this" keyword
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.method1();
        System.out.println();
        example.method2();
    }
}
