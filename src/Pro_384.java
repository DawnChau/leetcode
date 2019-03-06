import java.util.Random;

/**
 * shuffle一个数组
 * 每次往后读取数组的时候，
 * 当读到第i个的时候以1/i的概率随机替换1～i中的任何一个数，这样保证最后每个数字出现在每个位置上的概率都是相等的。
 */
public class Pro_384 {
    private int[] nums;
    private Random random;

    public Pro_384(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return nums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if (nums == null)
            return null;
        int[] a = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            // [0,i]
            int j = random.nextInt(i + 1);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
