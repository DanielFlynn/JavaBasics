package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Challenge
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state of behaviours (fields and methods).
        // For you specific type of vehicle you will want to add something specific for that type of car.


        Mustang mustang = new Mustang(55);
        mustang.steer(45);
        mustang.accelerate(30);
        mustang.accelerate(50);

    }
}
