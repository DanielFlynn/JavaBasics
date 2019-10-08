package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("2200", "HP", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(1920,1080));

	    Motherboard theMotherboard = new Motherboard("1221","Corsair", 4, 2, "v2.44");

	    PC thePC = new PC(theCase, theMonitor, theMotherboard);

	   thePC.powerUp();

	   	// Composition Challenge
		// Create a single room of a house using composition.
		// Think about the things that should be included in the room.
		// Maybe physical parts of the house but furniture as well.
		// At least one method to access an object via a getter and
		// then that objects public method as you saw previously
		// then at at least one method to hide the object e.g. not using a getter
		// but to access the object use in composition within the main class


		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");

		Ceiling ceiling = new Ceiling(12, 55);

		Bed bed = new Bed("Posh", 4, 6, 2, 1);

		Lamp lamp = new Lamp("Posh", false, 100);

		Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3,wall4,ceiling,bed,lamp);

		bedroom.makeBed();

		bedroom.getLamp().turnOn();


    }
}
