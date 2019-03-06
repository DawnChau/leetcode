import java.util.ArrayList;
import java.util.List;

/**
 * 寻找所有的子集
 */
public class Pro_078 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());

        for (int i = 0; i < nums.length; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            subsets(res, temp, nums, i);
        }
        return res;
    }

    private static void subsets(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        res.add(list);
        for (int j = index + 1; j < nums.length; j++) {
            List<Integer> temp = new ArrayList<>(list);
            temp.add(nums[j]);
            subsets(res, temp, nums, j);
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 2};
        subsets(a);
    }
}
