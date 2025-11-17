// Solution for Question-4 //

abstract class Vehicle {
    abstract void start();   // abstract method
    abstract void stop();   // abstract method
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }

    void stop() {
        System.out.println("Car stops with brakes");
    }
}

public class AbstractClassAndMethods {

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
