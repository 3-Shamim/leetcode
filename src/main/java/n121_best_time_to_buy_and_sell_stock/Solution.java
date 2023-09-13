package n121_best_time_to_buy_and_sell_stock;

class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;
        int low = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (low > prices[i]) {
                low = prices[i];
            } else if (profit < (prices[i] - low)) {
                profit = (prices[i] - low);
            }

        }

        return profit;
    }

    public int maxProfit1(int[] prices) {

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                int currentProfit = prices[j] - prices[i];

                if (currentProfit > profit) {
                    profit = currentProfit;
                }

            }
        }

        return profit;
    }

}

