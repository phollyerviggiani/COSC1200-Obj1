public class Circus {

    public circle1 juggle(circle1 updatedCircle) {
        updatedCircle.increaseRadius();
        circle1 createdCircle = new circle1();
        return createdCircle;
    }

    public static void main(String[] args) {
        Circus circus = new Circus();
        circle1 firstCircle = new circle1(); // radius set to 10
        circle1 secondCircle = new circle1();
        secondCircle = circus.juggle(firstCircle);
        // firstcircle radius is now 15 but returned circle is new circle with radius 10
        secondCircle.printRadius();
        firstCircle.printRadius(); // radius equals 15

    }
}