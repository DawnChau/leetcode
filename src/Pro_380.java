import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * 常数时间内增删查
 */
public class Pro_380 {

    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random random;

    /**
     * Initialize your data structure here.
     */
    public Pro_380() {
        this.map = new HashMap<>();
        this.list = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        // 存值和位置
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int tempLocation = map.get(val);
        // 和最后一个进行互换，删掉最后一个，时间就是O（1）
        if (tempLocation != list.size() - 1) {
            int lastVal = list.get(list.size() - 1);
            list.set(tempLocation, lastVal);
            map.put(lastVal, tempLocation);
        }
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
