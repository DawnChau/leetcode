package from.ant;

public class Pro_2317_Best {
    public int maximumXOR(int[] nums) {
        // 一次操作中，选择 任意 非负整数 x 和一个下标 i ，更新 nums[i] 为 nums[i] AND (nums[i] XOR x)
        // 1. 异或：相同为0，不同为1
        // nums[i] AND (nums[i] XOR x)
        //      => nums[i] AND x
        //          nums[i]的1变成0
        // 最大 逐位异或和，每一位都保留1，每一位都只留1个1，其他都通过AND X变成0
        // 该题化简为，只要有num[i]任意一位有1即可。
        // 即 nums[i] | nums[i+1]
        int ans = 0;
        for (int num : nums) {
            ans |= num;
        }
        return ans;
    }
}
