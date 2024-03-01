package from.ant;

public class Pro_0042_Best {
    public int trap(int[] height) {

        // 位置i左侧的最大值(包含i)
        int[] leftMaxHeight = new int[height.length];
        leftMaxHeight[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMaxHeight[i] = Math.max(leftMaxHeight[i - 1], height[i]);
        }

        // 位置i右侧的最大值(包含i)
        int[] rightMaxHeight = new int[height.length];
        rightMaxHeight[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMaxHeight[i] = Math.max(rightMaxHeight[i + 1], height[i]);
        }

        int count = 0;
        for (int i = 0; i < height.length; i++) {
            // 左侧最大值与右侧最大值的最小值，减去当前的高度
            int rain = Math.min(leftMaxHeight[i], rightMaxHeight[i]) - height[i];
            // 大于0代表能积下雨水
            if (rain > 0) {
                count += rain;
            }
        }
        return count;

    }
}
