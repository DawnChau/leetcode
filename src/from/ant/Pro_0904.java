package from.ant;

public class Pro_0904 {
    public int totalFruit(int[] fruits) {

        if (fruits.length <= 2) {
            return fruits.length;
        }

        int maxCount = 2;
        int[] nums = new int[fruits.length];
        int left = 0;
        int right = 0;
        int count = 0;

        while (right < fruits.length) {

            // 右移
            nums[fruits[right]]++;
            if (nums[fruits[right]] == 1) {
                count++;
            }

            while (count > 2) {
                nums[fruits[left]]--;
                if (nums[fruits[left]] == 0) {
                    count--;
                }

                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);
            right++;

        }

        return maxCount;
    }
}
