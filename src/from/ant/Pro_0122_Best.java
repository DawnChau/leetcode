package from.ant;

public class Pro_0122_Best {

    public int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                count += prices[i] - prices[i - 1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        System.out.println(new Pro_0122_Best().maxProfit(nums));
    }
}
