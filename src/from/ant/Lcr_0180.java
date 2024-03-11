package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Lcr_0180 {

    public int[][] fileCombination(int target) {
        if (target < 3) {
            return new int[][]{};
        }
        List<int[]> ans = new ArrayList<>();
        int fast = 2;
        int slow = 1;
        int sum = 3;
        while (fast < target) {
            if (sum == target) {
                ans.add(buildArray(slow, fast));
                // slow右移动
                sum -= slow;
                slow++;
                continue;
            }

            // fast右移动
            if (sum < target) {
                fast++;
                sum += fast;
                continue;
            }

            if (sum > target) {
                // slow右移动
                sum -= slow;
                slow++;
            }
        }

        return buildRes(ans);

    }

    private int[][] buildRes(List<int[]> ans) {
        int[][] res = new int[ans.size()][];
        int index = 0;
        for (int i = 0; i < ans.size(); i++) {
            res[index++] = ans.get(i);
        }
        return res;
    }

    private int[] buildArray(int slow, int fast) {
        int[] res = new int[fast - slow + 1];
        int index = 0;
        for (int i = slow; i <= fast; i++) {
            res[index++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Lcr_0180().fileCombination(12));
    }
}
