package javaPratices.DAY_8;

public class palindrome {

    // Function that returns true if
    public static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}