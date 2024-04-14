package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_2670 {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] preDiffCount = new int[nums.length];
        Set<Integer> preSet = new HashSet<>();

        int[] postDiffCount = new int[nums.length];
        Set<Integer> postSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            preSet.add(nums[i]);
            preDiffCount[i] = preSet.size();

            postSet.add(nums[nums.length - 1 - i]);
            postDiffCount[nums.length - 1 - i] = postSet.size();
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length - 1; i++) {
            ans[i] = preDiffCount[i] - postDiffCount[i + 1];
        }
        ans[nums.length - 1] = preDiffCount[nums.length - 1];

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 4, 2};
        System.out.println(new Pro_2670().distinctDifferenceArray(nums));
    }
}
