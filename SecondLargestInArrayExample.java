//package javaPratices;
//
//import java.util.Arrays;
//
////public class SecondLargestInArrayExample{
////    public static int getSecondLargest(int[] a, int total){
////        int temp;
////        for (int i = 0; i < total; i++)
////        {
////            for (int j = i + 1; j < total; j++)
////            {
////                if (a[i] > a[j])
////                {
////                    temp = a[i];
////                    a[i] = a[j];
////                    a[j] = temp;
////                }
////            }
////        }
////        return a[total-2];
////    }
////    public static void main(String args[]){
////        int a[]={1,2,5,6,3,2};
////        int b[]={44,66,99,77,33,22,55};
////        System.out.println("Second Largest: "+getSecondLargest(a,6));
////        System.out.println("Second Largest: "+getSecondLargest(b,7));
////          Arrays.sort(a);
////        System.out.println(a);
////    }}
////
//public class SecondLargestInArrayExample{
////    public static int getSecondLargest(int[] a, int total){
////        Arrays.sort(a);
//
//public static  void main(String[] args) {
//
//        int num = 0;
//        boolean flag = false;
//        for (int i = 2; i <= num ; ++i) {
//        // condition for nonprime number
//        if (num % i == 0) {
//        flag = true;
//        break;
//        }
//        }
//
//        if (!flag)
//        System.out.println(num + " is a prime number.");
//        else
//        System.out.println(num + " is not a prime number.");
//        }
//        }
//
//
//
////        return a[total-2];
////    }
////    public static void main(String args[]){
////        int a[]={1,2,5,6,3,2};
////        int b[]={44,66,99,77,33,22,55};
////        System.out.println("Second Largest: "+getSecondLargest(a,6));
////        System.out.println("Second Largest: "+getSecondLargest(b,7));
////    }}
//
