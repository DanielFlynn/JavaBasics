package academy.learnprogramming;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car ->  startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }

}
class BMW extends Car {

        public BMW(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "BMW ->  startEngine()";
        }

        @Override
        public String accelerate() {
            return "BMW -> accelerate()";
        }

        @Override
        public String brake() {
            return "BMW -> brake()";
        }
    }


class Audi extends Car {

        public Audi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Audi ->  startEngine()";
        }

        @Override
        public String accelerate() {
            return "Audi -> accelerate()";
        }

        @Override
        public String brake() {
            return "Audi -> brake()";
        }
}
public class Main {



    public static void main(String[] args) {
	    // We are going to go back to the car analogy
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generic car class
        // engine, cylinders,wheels etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed as parameters

        // create appropriate getters

        //create some methods like startEngine, accelerate and brake

        // show a message for each in the base class
        // now create 3 sub classes for your favourite vehicles
        //override the appropriate methods to demonstrate polymorphism in use
        // put all classes in the one java file (this one)



        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford(6, "Mondeo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Audi audi = new Audi(10, "TT");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        BMW bmw = new BMW (10, "1 Series");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
    }


    }

