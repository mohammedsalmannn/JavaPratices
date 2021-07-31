package javaPratices.DAY_5;

import java.util.Scanner;

import javaPratices.Utility;
public class PowerOf2 {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Power of Two : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Utility.powerOf(n);
    }
}