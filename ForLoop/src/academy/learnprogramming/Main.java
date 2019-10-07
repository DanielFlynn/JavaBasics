package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));

        //for(init; termination; increment){

        for(int i=0; i<5;i++) {
            System.out.println("Loop" + i + " hello");

        }

        for (double i=2; i<9; i++) {
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f",calculateInterest(10000, i)));

            //Above is an example of for loop.
            // init = what piece of code you want to initialize
            //termination is when you want it to end
            // increment - increases the value of the code you want to initialize


        }


        System.out.println("*******************************************");

        for (double i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000, i)));

        }

        int count = 0;
        for (int i=1 ; i<50; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count ==10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n){

        if (n ==1){
            return false;
        }

        for(int i=2; i<= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
