package from.ant;

import java.util.*;

// 不是最优解，应该用map+双向链表来做这道题
public class Pro_0146 {

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        lRUCache.get(1);    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        lRUCache.get(2);
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        lRUCache.get(1);
        lRUCache.get(3);    // 返回 3
//        lRUCache.get(4);    // 返回 4
        System.out.println(lRUCache.get(4));
    }
}

class LRUCache {

    // 优先级队列
    private PriorityQueue<Item> queue;
    private Map<Integer, Item> map;
    private int capacity = 0;
    private int version = 0;

    public LRUCache(int capacity) {
        queue = new PriorityQueue<>(capacity, (o1, o2) -> o2.getTimes() - o1.getTimes());
        map = new HashMap<>(capacity * 2);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            Item item = map.get(key);
            item.setTimes(version++);
            // 删除原来的
            if (queue.remove(item)) {
                queue.offer(item);
                map.put(key, item);
            }
            return item.getValue();
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Item item = map.get(key);
            item.setValue(value);
            item.setTimes(version++);
            // 删除原来的
            if (queue.remove(item)) {
                queue.offer(item);
                map.put(key, item);
            }
        } else {
            Item item = new Item(key, value, version++);
            map.put(key, item);
            if (queue.size() < this.capacity) {
                queue.offer(item);
            } else {
                // 移除使用次数最少的
                Item item1 = queue.poll();
                map.remove(item1.getKey());
                queue.offer(item);
            }
        }
    }
}

class Item implements Comparable {
    private int key;
    private int value;
    private int times;

    public Item(int key, int value, int times) {
        this.key = key;
        this.value = value;
        this.times = times;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }


    public Item(int key) {
        this.key = key;
    }

    @Override
    public int compareTo(Object o) {
        return ((Item) o).times;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return key == item.key;
    }

    @Override
    public int hashCode() {

        return Objects.hash(key);
    }
}