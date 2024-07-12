package n367_valid_perfect_square;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class No367 {

    // Solve with binary search
    public static boolean isPerfectSquare(int num) {

        long start = 1, end = num;

        if (end > 10000) {
            end = end / 64;
        }

        while (start <= end) {

            long mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if (num > mid * mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return false;
    }

    // Solve with linear search
    public static boolean isPerfectSquare2(int num) {

        for (int i = 1; i <= num; i++) {

            if (i * i > num) {
                return false;
            }

            if (i * i == num) {
                return true;
            }

        }

        return false;
    }

    // Solve by math
    public static boolean isPerfectSquare1(int num) {

        double sqrt = Math.sqrt(num);

        return Math.round(sqrt) == sqrt;
    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(808201));

    }

}
