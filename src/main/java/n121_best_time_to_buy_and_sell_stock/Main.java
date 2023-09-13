package n121_best_time_to_buy_and_sell_stock;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int profit = solution.maxProfit(nums);
        System.out.println(profit);

        nums = new int[]{7, 1, 5, 3, 6, 4};
        profit = solution.maxProfit(nums);
        System.out.println(profit);

        nums = new int[]{7, 6, 4, 3, 1};
        profit = solution.maxProfit(nums);
        System.out.println(profit);

        nums = new int[]{1, 1, 1, 1, 1};
        profit = solution.maxProfit(nums);
        System.out.println(profit);

        nums = new int[]{10, 5, 2, 1, 10};
        profit = solution.maxProfit(nums);
        System.out.println(profit);

    }

}
