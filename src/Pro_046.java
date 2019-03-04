import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class Pro_046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0)
            return res;
        // 开始深度优先遍历
        dfs(res, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, int index) {
        // 深度遍历到底了
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }
            res.add(temp);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            // 确定该位置
            swap(nums, index, i);
            dfs(res, nums, index + 1);
            // 再换回来
            swap(nums, index, i);
        }

    }

    private void swap(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }


}
