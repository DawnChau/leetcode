package from.ant;

public class Pro_1470_Best {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            res[index++] = nums[i];
            res[index++] = nums[n + i];
        }
        return res;
    }
}
