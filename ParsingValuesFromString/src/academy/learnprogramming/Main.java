package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        String numberAsString = "2018";
        System.out.println("numberAsString=" + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        String values = "123.098 ";
        System.out.println("One to Three = " + values);

        double newValues = Double.parseDouble(values);
        System.out.println("These numbers have been parsed " + newValues);

        numberAsString += 1;
        number +=1;

        System.out.println("number as string = " + numberAsString);
        System.out.println("number = " + number);


    }
}
