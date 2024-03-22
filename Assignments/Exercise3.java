// Patrick Hollyer-Viggiani Exercise 3: Polymorphism
// 100910706

// Vehicle class with default drive method
class Vehicle {

    // Drive method within vehicle class
    public void drive(){
        System.out.println("Drive Default Message");
    }
}

// Car class extending Vehicle
class Car extends Vehicle {


    // Overriding the drive method from vehicle in Car 
    @Override
    public void drive(){
        System.out.println("The car drives due to an engine.");
    }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
    
    // Overidding the drive method from vehicle in Bike
    @Override
    public void drive(){
        System.out.println("The bike is powered by a person's legs.");
    }
}

// Exercise 3 class with main in it to run the program
public class Exercise3 {
    public static void main(String[] args) {

        // Base vehicle class + drive method
        System.out.println("Default Vehicle Class:");
        Vehicle defaultVehicle = new Vehicle();
        defaultVehicle.drive();

        System.out.println(); // printline for spacing

        // Car class + drive method
        System.out.println("Car Message:");
        Car car = new Car();
        car.drive();


        System.out.println(); // printline for spacing

        // Bike class + drive method
        System.out.println("Bike Message:");
        Bike bike = new Bike();
        bike.drive();
    }
}
