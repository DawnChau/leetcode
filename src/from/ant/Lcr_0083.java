package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0083 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(nums, res, path, 0);
        return res;
    }

    private void backTracing(int[] nums, List<List<Integer>> res, LinkedList<Integer> path, int startIndex) {
        if (startIndex == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        // i表示每个位置可以选择的数量，i从startIndex开始代表前边选过的后边就不能选了
        // startIndex 表示为第几个位置选择
        for (int i = startIndex; i < nums.length; i++) {
            // 第startIndex位置选择了nums[i]
            mySwap(nums, i, startIndex);
            path.addLast(nums[startIndex]);
            backTracing(nums, res, path, startIndex + 1);
            path.removeLast();
            mySwap(nums, i, startIndex);
        }
    }

    private void mySwap(int[] nums, int i, int startIndex) {
        if (i == startIndex) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[startIndex];
        nums[startIndex] = temp;
    }
}
