package n441_arranging_coins;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class No441 {

    // Solve with binary search
    public static int arrangeCoins(int n) {

        int start = 1, end = n;

        while (start <= end) {

            long mid = start + (end - start) / 2;

            long count = (((mid * mid) - mid) / 2) + mid;

            if (n == count) {
                return (int) mid;
            } else if (n > count) {
                start = (int) (mid + 1);
            } else {
                end = (int) (mid - 1);
            }

        }

        return end;
    }

    // Solve with linear search
    public static int arrangeCoinsLS(int n) {

        int ans = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;

            if (sum <= n) {
                ans++;
            } else {
                break;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(7));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(9));
        System.out.println(arrangeCoins(10));
        System.out.println(arrangeCoins(1804289383)); // 60070

    }

}
