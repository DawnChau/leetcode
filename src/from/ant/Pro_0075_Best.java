package from.ant;

public class Pro_0075_Best {
    public void sortColors(int[] nums) {
        // 发现0和zeroEndIndex进行替换
        int zeroEndIndex = 0;
        // 发现2和twoStartIndex进行替换
        int twoStartIndex = nums.length - 1;

        for (int i = 0; i < nums.length; ) {
            if (i < zeroEndIndex || i > twoStartIndex) {
                i++;
                continue;
            }
            if (nums[i] == 0) {
                mySwap(nums, zeroEndIndex, i);
                zeroEndIndex++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                mySwap(nums, twoStartIndex, i);
                twoStartIndex--;
            }
        }
    }

    private void mySwap(int[] nums, int zeroEndIndex, int i) {
        if (zeroEndIndex == i) {
            return;
        }
        int temp = nums[zeroEndIndex];
        nums[zeroEndIndex] = nums[i];
        nums[i] = temp;
    }

}
