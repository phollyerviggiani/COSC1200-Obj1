// Patrick Hollyer-Viggiani Exercise 2
// 100910706

// Making abstract class Animal, with abstract methods makeSound() and move()
abstract class Animal {
    public abstract void makeSound();
    public abstract void move();

}

// Dog class extending Animal, calling the makeSound + move methods and filling it
class Dog extends Animal {
        public void makeSound() {
            System.out.println("The dog goes woof woof!");
        }

        public void move(){
            System.out.println("The dog moves by walking on all four legs.");
        }

    }

// Bird class extending Animal, calling the makeSound + move methods and filling it
class Bird extends Animal{

    public void makeSound() {
        System.out.println("The bird goes chirp chirp!");
    }

    public void move(){
        System.out.println("The bird moves by flying!");
    }

}

// Exercise 2 class, main method within it to run the program
public class Exercise2 {
    public static void main(String[] args) {

        // Adding dog class to main + calling makeSound/move
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.makeSound();
        dog.move();

        System.out.println();

        // Adding bird class to main + calling makeSound/move
        System.out.println("Bird: ");
        Bird bird = new Bird();
        bird.makeSound();
        bird.move();


    }
}
