package from.ant;

/**
 * 股票买卖
 */
public class Pro_0121_Best {

    public int maxProfit(int[] prices) {

        if (prices.length == 1) {
            return 0;
        }

        int minBuyPrice = prices[0];

        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minBuyPrice) {
                minBuyPrice = prices[i];
            } else {
                max = Math.max(prices[i] - minBuyPrice, max);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        System.out.println(new Pro_0121_Best().maxProfit(nums));
    }
}
