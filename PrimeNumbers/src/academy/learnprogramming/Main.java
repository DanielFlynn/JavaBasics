package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i =1; i<5000; i++){
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
// Whats happening in code:
    // Creating a method called isPrime with a boolean data type with an int parameter labelled 'n'
        // Within the method is a if statement. If n is equal to 1 it should return false as 1 is not a prime number
            // Creating a for loop - starting with 2 as a prime number has to be greater than one.
                // Will then find numbers that divide into the number(n)
                    // checks if there is a reminder between n and i. if 0 will confirm not prime number
                        // method is then called above in the main method.
                            // the for loop will then check any prime numbers within the 10 and 5000 range
                                // if statement will count and print the string plus the value (i) and the second string
                                    //  once it finds ten prime numbers if will exit the loop with the string output
    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }

        for (int i=2; i<= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }




}
