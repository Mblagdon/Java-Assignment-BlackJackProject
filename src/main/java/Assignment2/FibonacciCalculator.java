package Assignment2;

/**
 * Assignment 2 CP2280 Fibonacci Calculator to generate and check numbers in a fibonacci sequence.
 * the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such
 * that each number is the sum of the two preceding ones, starting from 0 and 1. That is:
 * F_0 = 0, F_1 = 1,
 * And
 * F_N = F_N - 1 + F_N - 2
 * The beginning of the sequence is thus: 0, 1, 1, 2, 3, 5, 8, 13, ... *
 *
 * @author MBlagdon
 */

/**
 * A public class called FibonacciCalculator
 */
public class FibonacciCalculator {
    /**
     * final int F_0
     */
    public static final int F_0 = 0;
    /**
     * final int F_1
     */
    public static final int F_1 = 1;

    /**
     * Check to see if number input is in fibonacci sequence
     *
     * @param n Number > 0
     * @return true if n is a fibonacci number
     */
    public static boolean isFibonacciNumber(int n) {
        //TODO write method
        if (n==0 || n==1) {
            return true;
        }
        int F_0 = 0; //start with 0
        int F_1 = 1; //start with 1
        int Fn = 0; // a temporary variable
        while (Fn < n) {
            Fn = F_0 + F_1;
            F_0 = F_1;
            F_1 = Fn;
        }
        return Fn == n; //Had if (Fn == n) return true; else return false; intelliJ said could simplify

    }


    /**
     * Get fibonacci number at requested sequence position
     *
     * @param sequencePosition position in fibonacci sequence (must be > 0)
     * @return value in fibonacci sequence
     */

    public static int getFibonacciNumber(int sequencePosition) {
        //TODO write method
        if (sequencePosition == 0){
            return 0;
        }
        if (sequencePosition == 1){
            return 1;
        }
        int F_0 = 0; //start with 0
        int F_1 = 1; //start with 1
        int Fn = 0; // a temporary variable
        for (int i = 2; i <= sequencePosition; i++) {
            Fn = F_0 + F_1;
            F_0 = F_1;
            F_1 = Fn;
        }

        return Fn;
    }

}
