package from.ant;

public class Lcr_0161_Best {
    public int maxSales(int[] sales) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
