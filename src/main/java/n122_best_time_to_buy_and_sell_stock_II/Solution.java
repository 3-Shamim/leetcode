package n122_best_time_to_buy_and_sell_stock_II;

class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int low = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] <= prices[i - 1]) {

                profit += prices[i - 1] - low;
                low = prices[i];

            } else if (i == prices.length - 1) {
                profit += prices[i] - low;
            }

        }

        return profit;
    }

}

