package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
//        while(count!= 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(count = 1; count!= 6; count++) {
//            System.out.println("**************************************");
//            System.out.println("Count value is " + count);
//        }
//        count = 1;
//        while (true){
//            if (count ==6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("_______________________________");
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);
//        int number = 0;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }


        int number = 0;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >=5) {
                break;
            }


        }

        System.out.println("Total even numbres found = " + evenNumbersFound);
    }
    // Method above - two variables with an int data type. number assigned to zero and finishNumber assigned to 20
    //while the number is less than or equal to finish number it will continue to increment until number reaches 20.
    // If method on line 46 returns an even number, print and continue until 20 is met

    public static boolean isEvenNumber (int number){
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }


    }


        }


