package from.ant;

import java.util.Iterator;
import java.util.TreeMap;

// [1,16,49,16,121]  -> 1
// [14,14,196,196,38416,38416] -> 5
// [1,1,1,1,1,1,1,1,1,1,2,4,8,16,32,64,128,256,512,1024] -> 9
public class Pro_3020 {
    public int maximumLength(int[] nums) {
        int maxSize = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int times = map.get(num);
                map.put(num, times + 1);
            } else {
                map.put(num, 1);
            }
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            // 只出现一次，忽略
            if (map.get(num) == 1) {
                maxSize = Math.max(1, maxSize);
                continue;
            } else {
                maxSize = Math.max(maxSize, getSize(map, num));
            }
        }
        return maxSize;
    }

    private int getSize(TreeMap<Integer, Integer> map, int num) {
        if (num == 1) {
            int times = map.get(1);
            if (times % 2 == 0) {
                return times - 1;
            } else {
                return times;
            }
        }
        int length = 1;
        int cur = num;
        int next = cur * cur;
        while (map.containsKey(next)) {
            if (map.get(next) > 1) {
                cur = next;
                length++;
                next = cur * cur;
            } else {
                break;
            }
        }
        if (map.containsKey(next)) {
            return length * 2 + 1;
        }
        return (length - 1) * 2 + 1;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        System.out.println(new Pro_3020().maximumLength(nums));
    }
}
