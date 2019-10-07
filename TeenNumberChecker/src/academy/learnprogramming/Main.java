package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(14,14,14));
    }

    public static boolean hasTeen (int first, int second, int third) {

        if ((first >= 13 && first <= 19) || (second >= 13 && second <= 19) || (third >= 13 && third <= 19)){
            return true;
        }
        else {
            return false;
        }
    }
}


