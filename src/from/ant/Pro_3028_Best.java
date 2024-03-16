package from.ant;

public class Pro_3028_Best {
    public int returnToBoundaryCount(int[] nums) {
        int res = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum == 0) {
                res++;
            }
        }
        return res;
    }
}
