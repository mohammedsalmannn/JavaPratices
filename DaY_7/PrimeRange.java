package javaPratices.DaY_7;

import javaPratices.Utility;
import java.util.Scanner;

public class PrimeRange
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int end = sc.nextInt();
        System.out.println("Prime numbers between "+start+" and "+end+" are : ");
        Utility.range(end, start);

    }
}