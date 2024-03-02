package from.ant;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Pro_0128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxCount = 1;
        int last = Integer.MIN_VALUE;
        int count = 1;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num == last + 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
            last = num;
        }

        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(new Pro_0128().longestConsecutive(nums));
    }
}
