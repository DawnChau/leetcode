package from.ant;

public class Pro_0977_Best {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        int positiveIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveIndex = i;
                break;
            }
        }
        int negetiveIndex;
        // 全是负数
        if (positiveIndex == -1) {
            negetiveIndex = nums.length - 1;
            positiveIndex = negetiveIndex + 1;
        } else {
            negetiveIndex = positiveIndex - 1;
        }

        int index = 0;
        while (negetiveIndex >= 0 || positiveIndex < nums.length) {
            if (negetiveIndex < 0) {
                res[index++] = nums[positiveIndex] * nums[positiveIndex];
                positiveIndex++;
            } else if (positiveIndex >= nums.length) {
                res[index++] = nums[negetiveIndex] * nums[negetiveIndex];
                negetiveIndex--;
            } else {
                if (Math.abs(nums[negetiveIndex]) > nums[positiveIndex]) {
                    res[index++] = nums[positiveIndex] * nums[positiveIndex];
                    positiveIndex++;
                } else {
                    res[index++] = nums[negetiveIndex] * nums[negetiveIndex];
                    negetiveIndex--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1};
        System.out.println(MyUtils.printArray(new Pro_0977_Best().sortedSquares(nums)));
    }
}
