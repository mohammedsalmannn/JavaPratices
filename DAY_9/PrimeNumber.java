package javaPratices.DAY_9;

import javaPratices.MathFunction;

public class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (MathFunction.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}