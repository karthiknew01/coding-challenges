package easy;

/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">...</a>
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int left = 0;
        int maxProfit = 0;

        for (int right = 0; right < prices.length; right++) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right;
            }

        }

        return maxProfit;
    }



}
