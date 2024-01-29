package from.ant;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class Pro_0347 {

    // 需要动态更新优先级队列，不是最优解，优先级队列有删除
    public int[] topKFrequent_not_best(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Item347> queue = new PriorityQueue<>((o1, o2) -> o2.getTimes() - o1.getTimes());
        Map<Integer, Item347> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Item347 item347 = map.get(nums[i]);
                int times = item347.getTimes();
                item347.setTimes(times + 1);
                // 先删除后加入
                queue.remove(item347);
                queue.offer(item347);
            } else {
                Item347 item347 = new Item347();
                item347.setNum(nums[i]);
                item347.setTimes(1);
                map.put(nums[i], item347);
                queue.offer(item347);
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll().getNum();
        }
        return res;
    }

    // 这种方式性能会好很多
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        Map<Integer, Integer> map = new HashMap<>();

        // 可以一次性统计出来频率
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // 然后构建大顶堆
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(entry);
        }

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll().getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 1, 1, 2, 2};
        System.out.println(MyUtils.printArray(new Pro_0347().topKFrequent_not_best(nums, 2)));
    }
}

class Item347 implements Comparable {

    private int num;

    private int times;

    @Override
    public int compareTo(Object o) {
        return ((Item347) o).times;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item347 item347 = (Item347) o;
        return num == item347.num;
    }

    @Override
    public int hashCode() {

        return Objects.hash(num);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}


