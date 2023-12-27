package from.ant;

/**
 * 从有序数组中除掉重复元素--数组
 */
public class Pro_0026_Best {

    public int removeDuplicates(int[] nums) {

        int countIndex = 1;
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                continue;
            }

            temp = nums[i];
            nums[countIndex++] = temp;
        }

        return countIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(new Pro_0026_Best().removeDuplicates(nums));
    }
}
