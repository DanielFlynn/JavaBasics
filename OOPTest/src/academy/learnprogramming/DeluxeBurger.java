package academy.learnprogramming;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Big Boy", "Beef", 12.99, "Wholemeal");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.49);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(" Cannot add additional items to a deluxe burger");
    }
}
