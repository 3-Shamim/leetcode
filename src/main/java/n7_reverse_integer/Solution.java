package n7_reverse_integer;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Solution {

    public int reverse(int x) {

        long result = 0;
        int multiplier = 1;

        if (x < 0) {
            multiplier = -1;
            x = x * multiplier;
        }

        while (x > 0) {

            int reminder = x % 10;

            result = result * 10 + reminder;

            x = x / 10;

        }

        if (hasOutsideOfRange(result)) {
            return 0;
        }

        return (int) (result * multiplier);
    }

    public static boolean hasOutsideOfRange(long num) {
        return num > 2147483647 || num < -2147483648;
    }

}

