/**
 * Factorial.java
 *
 * A program that performs a factorial calculation on a number.
 *
 * @author Brandon Nguyen
 *
 * @version October 16, 2016
 *
 */
public class Factorial {

    private int factorial (int n) {

        int result = 1;
        for (int i = n; i != 0; i--) {
            result *= i;
        }

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }


        return result;
    }

    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5)); // Expect 120

    }

}