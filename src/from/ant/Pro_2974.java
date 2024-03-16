package from.ant;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Pro_2974 {
    public int[] numberGame(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }

        for (int i = 0; i < nums.length; i+=2) {
            int a = queue.poll();
            int b = queue.poll();
            res[index++] = b;
            res[index++] = a;
        }
        return res;
    }
}
