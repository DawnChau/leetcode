import java.util.*;

/**
 * 返回k个最频繁的元素
 */
public class Pro_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();

        // 最大堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        Map<Integer, Integer> map = new HashMap<>();

        // 记录出现的次数
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        // 加入优先队列
        for (Map.Entry<Integer, Integer> entry : set) {
            queue.add(entry);
        }

        for (int i = 0; i < k; i++) {
            list.add(queue.poll().getKey());
        }

        return list;
    }
}
