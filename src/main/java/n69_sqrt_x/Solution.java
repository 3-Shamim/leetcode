package n69_sqrt_x;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: 21/6/24
 * Time: 9:04 AM
 * Email: mdshamim723@gmail.com
 */

public class Solution {

    public int mySqrt(int x) {

//        return linearSearch(x);
//        return binarySearch(x);
        return binarySearch1(x);
    }

    private int binarySearch(int x) {

        int start = 0;
        int end = x;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long) x > (long) mid * mid) {
                start = mid + 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                end = mid - 1;
            }

        }

        return end;
    }

    private int binarySearch1(int x) {

        int start = 0;
        int end = x;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (x > square) {
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }

        }

        return end;
    }

    private int linearSearch(int x) {

        int i;

        for (i = 1; ; i++) {

            int square = i * i;

            if (square == x) {
                return i;
            } else if (square > x) {
                return i - 1;
            }

        }

    }

}
