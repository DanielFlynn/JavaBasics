package academy.learnprogramming;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog's loves to chew");

    }

    @Override
    public void eat() {
        System.out.println("Called dog.eat from animal class");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog walk called");
        move(9);
    }

    public void run() {
        System.out.println("Dog run called");
        move(18);
    }
    private  void moveLegs (int speed) {
        System.out.println("dog.movelegs called");
    }
    @Override
    public void move(int speed) {
        System.out.println(" dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
