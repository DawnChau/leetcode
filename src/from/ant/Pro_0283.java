package from.ant;

/**
 * 将0移动到最后
 */
public class Pro_0283 {
    public void moveZeroes(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index == i) {
                    index++;
                } else {
                    mySwap(nums, i, index);
                    index++;
                }
            }
        }
    }

    private void mySwap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        new Pro_0283().moveZeroes(nums);
        System.out.println(MyUtils.printArray(nums));
    }
}
