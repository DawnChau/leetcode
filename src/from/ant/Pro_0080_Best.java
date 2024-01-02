package from.ant;

public class Pro_0080_Best {
    public int removeDuplicates(int[] nums) {

        int left = 0;
        int temp = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                temp = nums[i];
                count = 1;
            }
            if (count <= 2) {
                if (i != left) {
                    mySwap(nums, i, left);
                }
                left++;
            }
        }
        return left;
    }

    private void mySwap(int[] nums, int i, int left) {
        int temp = nums[i];
        nums[i] = nums[left];
        nums[left] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(new Pro_0080_Best().removeDuplicates(nums));
    }
}
