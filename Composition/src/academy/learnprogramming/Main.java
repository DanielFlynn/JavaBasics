package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2200", "HP", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(1920,1080));

	    Motherboard theMotherboard = new Motherboard("1221","Corsair", 4, 2, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);

	   thePC.powerUp();
    }
}
