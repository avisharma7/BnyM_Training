// Define a Vehicle interface with default method
interface Vehicle {
    void start(); // Abstract method

    void stop(); // Abstract method

    // Default method
    default void defaultSpeed() {
        System.out.println("The vehicle speed is 60 km/h by default.");
    }
}

// Implementing class Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    // Override the default method if needed
    @Override
    public void defaultSpeed() {
        System.out.println("The car speed is 100 km/h by default.");
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Output: Car started.
        car.defaultSpeed(); // Output: The car speed is 100 km/h by default.
        car.stop(); // Output: Car stopped.
    }
}
