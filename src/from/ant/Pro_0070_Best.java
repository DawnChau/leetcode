package from.ant;

/**
 * 爬楼梯
 */
public class Pro_0070_Best {

    public int climbStairs(int n) {

        int[] nums = new int[n + 1];

        if (n == 1 || n == 2) {
            return n;
        }

        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0070_Best().climbStairs(3));
    }
}
