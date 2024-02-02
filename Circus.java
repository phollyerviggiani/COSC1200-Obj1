public class Circus {

    public Circle juggle(Circle updatedCircle) {
        updatedCircle.increaseRadius();
        Circle createdCircle = new Circle();
        return createdCircle;
    }

    public static void main(String[] args) {
        Circus circus = new Circus();
        Circle firstCircle = new Circle(); // radius set to 10
        Circle secondCircle = new Circle();
        secondCircle = circus.juggle(firstCircle);
        // firstcircle radius is now 15 but returned circle is new circle with radius 10
        secondCircle.printRadius();
        firstCircle.printRadius(); // radius equals 15

    }
}