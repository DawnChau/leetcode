package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0079_Best {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return ans;
        }
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(nums, ans, path, 0);
        return ans;
    }

    private void backTracing(int[] nums, List<List<Integer>> ans, LinkedList<Integer> path, int startIndex) {
        ans.add(new ArrayList<>(path));

        for (int i = startIndex; i < nums.length; i++) {
            path.addLast(nums[i]);
            // 下一层从i+1开始，i之前的数不再选取
            backTracing(nums, ans, path, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        System.out.println(new Lcr_0079_Best().subsets(nums));
    }
}
