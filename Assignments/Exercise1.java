// Patrick Hollyer-Viggiani Exercise 1
// 100910706

// Main shape class with string colour, and boolean filled (t/f)
class Shape {
   private String colour;
   private boolean filled;

    public Shape(String colour, boolean filled) { // shape constructor
        this.colour = colour;
        this.filled = filled;
    }

    // Colour getter + setter
    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    // Filled getter + setter
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Empty areas and perimeter function because they are being overrode later
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

}

// Circle Class extending shape, with the private double radius
class Circle extends Shape {
    private double radius;

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    // Radius getter + setter
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            // Handle invalid input
            System.out.println("Invalid radius value.");
        }
    }

    public double getRadius() {
        return radius;
    }

    // Overriding the area and perimeter methods to make it work for each shape
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectange class extending shape with private doubles of length and width
class Rectangle extends Shape {
    private double length;
    private double width;

    // Rectangle constructor, with length, width, colour, and filled
    public Rectangle(double length, double width, String colour, boolean filled) {
        super(colour, filled);
        this.length = length;
        this.width = width;

    }

    // Setters and getters for length
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            // Handle invalid input
            System.out.println("Invalid length value.");
        }
    }

    public double getLength() {
        return length;
    }

    // Setters and getters for width
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    // Override methods for area and perimeter to let it function for rectangle
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Exercise 1 class where main is to run the program
public class Exercise1 {
    public static void main(String[] args) {

        // Adding circle class, printing out the area and perimeter
        Circle circle = new Circle(4, "Blue", true); 
        System.out.println("Circle Information:");
        System.out.println("The circle's area is: " + circle.getArea());
        System.out.println("The circle's perimeter is: " + circle.getPerimeter());

        System.out.println();

        // Adding rectangle class, printing out the area and perimeter
        Rectangle rectangle = new Rectangle(15, 5, "Red", false);
        System.out.println("Rectangle Information:"); 
        System.out.println("The rectangle's area is: " + rectangle.getArea());
        System.out.println("The rectangles perimeter is: " + rectangle.getPerimeter());

        }
    }
