package javaPratices.DAY_11;

import java.util.Scanner;
import javaPratices.Utility;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Utility utility=new Utility();
        System.out.println("Enter n for Harmonic Series");
        int range=scanner.nextInt();
      //  utility.harmonic(range);
        scanner.close();
    }
}
