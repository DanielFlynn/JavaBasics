package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0; //count the valid numbers
        int sum = 0; // sum of counted numbers

        while(true) { // creating an endless loop until all parameters are met (once met 10 it will break)
            int order = counter + 1;
            System.out.println("Enter Number # " + order + ":"); // This will increment each time and add 1 throughout the loop

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }

            } else {
                System.out.println("Invalid Number");
            }

                scanner.nextLine(); // handle end of line (enter key)
            }

        System.out.println("Total Sum = " + sum);
        scanner.close();
    }
}
