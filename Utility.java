package javaPratices;

public class Utility {

    public static void monthDay(int month, int day) {
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                || (month == 4 && day >=  1 && day <= 30)
                || (month == 5 && day >=  1 && day <= 31)
                || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }

    public double FindDelta(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double QuadraticEquation1(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation1 = (-b + sqrtDelta) / (2 * a);
        return equation1;
    }

    /*
     * Purpose: Method is written for finding second Quadratic Equation
     * @param delta delta of a b and c
     * @return returns of quadratic equation answer
     */
    public double QuadraticEquation2(int a, int b, double delta) {
        double absDelta = Math.abs(delta);
        double sqrtDelta = Math.sqrt(absDelta);
        double equation2 = (-b - sqrtDelta) / (2 * a);
        return equation2;
    }
}




public class Frequency {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array fr will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }}