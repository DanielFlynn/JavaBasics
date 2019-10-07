package academy.learnprogramming;

public class Main {


    public static void main(String[] args) {

        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number 975 is " + sumDigits(975));
        System.out.println("Sum of digits in number 5734 is " + sumDigits(5734));
        System.out.println("Sum of digits in number 97425 is " + sumDigits(97425));
        System.out.println("Sum of digits in number 89 is " + sumDigits(89));

    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5

        while (number > 0) {
            // extract the least significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least significant digit
            number /=10;  //number = number /10

        }

        return sum;
    }
}
