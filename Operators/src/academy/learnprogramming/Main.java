package academy.learnprogramming;

import jdk.jfr.Frequency;
import org.w3c.dom.ls.LSOutput;

import java.awt.image.AreaAveragingScaleFilter;

public class Main {

    public static void main(String[] args) {
	// Operators (Special symbols that perform specific operations +,=,*,/ etc)
        // Operands (Used to describe any object manipulated by an operator)
            // Expressions (Combining variables, literals, method returns values)
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previoustResult = " + previousResult);
        result = result - 1;
        System.out.println("New Result = " + result);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 -1 = 1
        System.out.println("2 - 1 = " + result);

        result +=2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 5
        result -=5;
        System.out.println("10 - 5 = " + result);




    }
}
