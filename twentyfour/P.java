
package twentyfour;

import java.math.BigInteger;

public class P {
    static int count = 0;

    public static BigInteger fact(int n) {
        if (n < 0) {
            System.out.println("Negative numbers do not have factorial");
            return BigInteger.ZERO;
        }
        count++;
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }

    public static void main(String[] args) {
        // Reset count before each batch of calculations
        count = 0;
        for (int i = 90; i < 100; i++) {
            BigInteger result = fact(i);
            System.out.println("Factorial of " + i + " is " + result + " | recursive calls: " + count);
            count = 0; // reset count for next iteration
        }

        try {
            int n = Integer.parseInt("1000");
            BigInteger res = fact(n);
            System.out.println("Factorial of " + n + " is " + res);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid positive number");
        }
    }
}
