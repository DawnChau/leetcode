package from.ant;

import java.util.List;

public class Pro_2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (getOneCount(i) == k) {
                count += nums.get(i);
            }
        }
        return count;
    }

    private int getOneCount(int i) {
        int count = 0;
        while (i > 0) {
            if (i % 2 == 1) {
                count++;
            }
            i /= 2;
        }
        return count;
    }
}
