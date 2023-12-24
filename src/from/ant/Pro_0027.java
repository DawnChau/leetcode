package from.ant;

/**
 * 数组中原地删除某个数
 * 把删除的数放后边
 */
public class Pro_0027 {
    public int removeElement(int[] nums, int val) {
        int index = nums.length - 1;

        // index位置的数也需要处理，所以这里要用<=
        for (int i = 0; i <= index; ) {
            if (val != nums[i]) {
                i++;
            } else {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index--;
            }
        }
        return index + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        int res = new Pro_0027().removeElement(nums, 0);
        System.out.println(res);
        System.out.println(MyUtils.printArray(nums));
    }
}
