package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
	    System.out.println(myMinFloatValue);
		System.out.println(myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println(myMinDoubleValue);
		System.out.println(myMaxDoubleValue);

		int myIntValue = 5;
		float myFloatValue = (float) 5.25;
		double myDoubleValue = 5.25;
		System.out.println(myIntValue);
		System.out.println(myFloatValue);
		System.out.println(myDoubleValue);

		double numberOfPounds = 200d;
		double convertedKilos = numberOfPounds * 0.45359237d;
		System.out.println("Converted Kilos To Pounds " + convertedKilos);
    }
}

