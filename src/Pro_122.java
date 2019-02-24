/**
 * 买卖股票2
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class Pro_122 {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int min = prices[0];
        int max = prices[0];
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < max) {
                sum += max - min;
                min = prices[i];
                max = prices[i];
            }
            if (prices[i] > min) {
                max = prices[i];
            }
        }
        sum += max - min;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(a));
    }
}
