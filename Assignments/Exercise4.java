// Patrick Hollyer-Viggiani Exercise 4: Interface
// 100910706

// Making interface drawable, with draw method.
interface Drawable {
    public void draw();
}

// circles class that imlements drawable, taking in radius as input
class Circles implements Drawable {
    double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    // draw method implimented from drawable
    public void draw(){
        System.out.println("Draw a circle with the radius of: " + radius);
    }
}

// square class that impliments drawable, taking sidelength as input
class Square implements Drawable{
    double sidelength;

    public Square(double sidelength){
        this.sidelength = sidelength;
    }

    // draw method within squres
    public void draw(){
        System.out.println("Drawing a square with the sidelength of: " + sidelength);
    }
}

// exercise4 function that contains the main
public class Exercise4 {
    public static void main(String[] args) {
        // calling circle class, passing in 5 as the radius + draw method
        Circles circle = new Circles(5);
        circle.draw();
        // square class, passing in sidelength + draw method
        Square square = new Square(15);
        square.draw();
    }
    

    
}
