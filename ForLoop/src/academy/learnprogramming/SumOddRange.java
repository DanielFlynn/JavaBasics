package academy.learnprogramming;

public class SumOddRange {



        public static boolean isOdd(int number) {
            if (number < 0) {
                return false;
            } else if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }

        public static int sumOdd(int start, int end) {
            if (start > end || start < 0 || end < 0) {
                return -1;
            } else {
                boolean numTest = false;
                int oddSum = 0;
                for (int n = start; n < end; n++) {
                    numTest = isOdd(n);
                    if (numTest) {
                        oddSum += n;
                    }
                }
                return oddSum;


            }

        }
    }







