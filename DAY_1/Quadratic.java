package javaPratices.DAY_1;
import javaPratices.Utility;

import java.util.Scanner;

public class Quadratic {
    private static Scanner scanner;
    public static void main(String[] args) {
        Utility utility=new Utility();
        int a, b, c;
        double delta=0;

        double equation1,equation2;
        scanner = new Scanner(System.in);
        System.out.println("Enter value for a");
        a=scanner.nextInt();
        System.out.println("Enter value for b");
        b=scanner.nextInt();
        System.out.println("Enter va3lue for c");
        c=scanner.nextInt();

        //now we are going to find delta
        delta=utility.FindDelta(a,b,c);

        equation1=(double)utility.QuadraticEquation1(a,b,delta);
        equation2=(double)utility.QuadraticEquation2(a,b,delta);

        System.out.println("Root 1 of X is :"+equation1);
        System.out.println("Root 2 of X is :"+equation2);

        scanner.close();
    }

}