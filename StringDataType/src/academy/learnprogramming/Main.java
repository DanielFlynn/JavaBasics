package academy.learnprogramming;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to" + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to" + myString);
        String numberString = "250.55 "; // As its a string, wont add mathematical
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
