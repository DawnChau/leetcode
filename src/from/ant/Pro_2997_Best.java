package from.ant;

public class Pro_2997_Best {
    public int minOperations(int[] nums, int k) {
        int ans = k;
        for (int num : nums) {
            ans ^= num;
        }
        int count = 0;
        while (ans > 0) {
            if (ans % 2 == 1) {
                count++;
            }
            ans /= 2;
        }
        return count;
    }

}
