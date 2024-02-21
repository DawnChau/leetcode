package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_0120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            // 第一列
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            // 最后一列
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);

        }

        int max = Integer.MAX_VALUE;
        for (int i = 2; i < triangle.size(); i++) {
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
        }

        for (int i = 0; i < triangle.size(); i++) {
            max = Math.min(dp[triangle.size() - 1][i], max);
        }

        return max;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3,4);
        List<Integer> list3 = Arrays.asList(6,5,7);
        List<Integer> list4 = Arrays.asList(4,1,8,3);
        ans.add(list1);
        ans.add(list2);
        ans.add(list3);
        ans.add(list4);
        System.out.println(new Pro_0120().minimumTotal(ans));

    }
}
