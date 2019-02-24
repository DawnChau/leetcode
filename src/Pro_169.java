import java.util.HashMap;

/**
 * 统计超过半数的元素
 */
public class Pro_169 {
    public static int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int gate = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                if (val + 1 > gate)
                    return nums[i];
                else
                    map.put(nums[i], val + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 3};
        System.out.println(majorityElement(a));
    }
}
