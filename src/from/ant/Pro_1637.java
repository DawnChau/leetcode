package from.ant;

import java.util.Arrays;

public class Pro_1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] array = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            array[i] = points[i][0];
        }
        Arrays.sort(array);
        int max = 0;
        int pre = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] - pre == 0) {
                pre = array[i];
                continue;
            }
            max = Math.max(array[i] - pre, max);
            pre = array[i];
        }
        return max;
    }
}
