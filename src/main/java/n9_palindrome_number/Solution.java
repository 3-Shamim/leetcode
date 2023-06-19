package n9_palindrome_number;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x <= 9) {
            return true;
        }

        String s = String.valueOf(x);

        int length = s.length();
        boolean isEven = length % 2 == 0;

        int start = 0;
        int end = length - 1;


        while (start != (isEven ? end + 1 : end)) {

            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;

        }

        return true;
    }

}

