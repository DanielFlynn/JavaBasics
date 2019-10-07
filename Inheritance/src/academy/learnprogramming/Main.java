package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Brian", 1, 1,5,5);

        Dog dog = new Dog("Poodle", 8,2,4,1,99,"Furry");
        dog.eat();
        dog.walk();
        dog.run();
        }

}

