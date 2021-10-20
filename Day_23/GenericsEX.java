package javaPratices.Day_23;


import java.util.Scanner;

public class GenericsEX<T> {

    public static void  main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Object obj =  scanner.next();
        System.out.println(print(obj));
    }

    public static <T extends Object> T print(T obj) {
        return obj;
    }


}
