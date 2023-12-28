package from.ant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 全排列--回溯法
 */
public class Pro_0046_Best {
    public List<List<Integer>> permute(int[] nums) {

        if (nums.length == 1) {
            return Collections.singletonList(Collections.singletonList(nums[0]));
        }

        List<List<Integer>> res = new ArrayList<>();

        dfs(res, nums, 0);

        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, int index) {
        // 到最后一个数字
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            res.add(temp);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            // 交换
            mySwap(nums, i, index);
            dfs(res, nums, index + 1);
            // 再换回来
            mySwap(nums, i, index);
        }
    }

    private void mySwap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(new Pro_0046_Best().permute(nums).size());
    }
}
