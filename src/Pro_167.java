import java.util.HashMap;

/**
 * 求数组中两个数的和等于target的两个数的下标
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class Pro_167 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.keySet().contains(numbers[i])) {
                res[0] = map.get(numbers[i]) + 1;
                res[1] = i + 1;
                return res;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return res;
    }
}
