package javaPratices.DAY_9;


import javaPratices.MathFunction;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        MathFunction.fact(number);
    }
}