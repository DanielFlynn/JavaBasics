package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car ford = new Car();
        Car bmw = new Car();
        ford.setEngine("Very Big Engine");
        System.out.println("Engine Type = " + ford.getEngine());
        ford.setModel("Mondeo");
        System.out.println("The model for this Ford is a " + ford.getModel());
    }
}
