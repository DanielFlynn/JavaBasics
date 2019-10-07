package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {




    }

    public static boolean isLeapYear (int year) {


        year = 1998;
        year = 2400;


        if (year >= 1 && year <= 9999) {
            return false;
        }
        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        }
        if ((year % 100 == 0) && year % 400 != 0) {
            return true;
        }
        else {
            return false;
        }



    }
}
