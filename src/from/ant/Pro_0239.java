package from.ant;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调栈
 */
public class Pro_0239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue0239 queue = new MyQueue0239();
        int len = nums.length - k + 1;
        int[] res = new int[len];
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            res[i] = queue.peek();
            queue.poll(nums[i]);
            if( i + k < nums.length){
                queue.offer(nums[i + k]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1,3,1,2,0,5};
        System.out.println(new Pro_0239().maxSlidingWindow(n, 3));
    }
}

class MyQueue0239 {

    private Deque<Integer> queue = new LinkedList<>();

    public void poll(int n) {
        if (!queue.isEmpty()) {
            if(queue.peek() == n){
                queue.poll();
            }
        }
    }

    public void offer(int n) {
        while (!queue.isEmpty() && queue.getLast() < n) {
            queue.removeLast();
        }
        queue.offer(n);
    }

    public int peek() {
        return queue.peek();
    }
}
