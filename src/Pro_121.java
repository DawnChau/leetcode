/**
 * 股票买卖问题--动态规划
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 */
public class Pro_121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1 || prices.length == 0)
            return 0;
        int min = prices[0];
        int max = 0;  // 不能用Integer.MIN_VALUE
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
