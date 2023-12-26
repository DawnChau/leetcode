package from.ant;

public class Pro_0011 {
    public int maxArea(int[] height) {

        int span = height.length - 1;
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (left < right) {
            maxArea = Math.max(maxArea, span * Math.min(height[left], height[right]));
            span--;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1};
        System.out.println(new Pro_0011().maxArea(nums));
    }
}
