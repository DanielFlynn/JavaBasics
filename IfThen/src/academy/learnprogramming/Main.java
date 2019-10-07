package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// If-then (basic control flow statement. Executes certain section of code only ia test evaluates as true
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is an alien!");
            System.out.println("And i am scared of aliens");

        }

        int topScore = 80;
        if (topScore < 100) { // != not equal to
            System.out.println("You got the high score");

        }

        int perfectScore = 100;
        if(perfectScore >= 100) { // less than or greater than but equal to
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) { // Logical (True and false)
            System.out.println("Greater than the second top score and less than 100");
        }


        if ((topScore > 90) || (secondTopScore <= 90)) { // Logical (True of false)
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }


        boolean isCar = false;
        if (isCar) { // shortcut(refer to variable, ! if not true)
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge

        double challengeOne = 20.00d;
        double challenegeTwo = 80.00d;
        double challengeThree = (challengeOne + challenegeTwo) * 100.00d;
        System.out.println("Total = " + challengeThree);
        double challengeFour = challengeThree % 40.00d;
        System.out.println("Remainder = " + challengeFour);
        boolean challengeFive = (challengeFour == 0) ? true : false;
        System.out.println("ChallengeFive = " + challengeFive);
        if (!challengeFive) {
            System.out.println("Got some remainder");
        }
    }




}

