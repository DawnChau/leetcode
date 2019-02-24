import java.util.Arrays;

/**
 * 合并数组--数组
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 */
public class Pro_088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 暂存nums1
        int[] newArray = Arrays.copyOfRange(nums1, 0, m);
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (newArray[i] < nums2[j]) {
                nums1[index++] = newArray[i++];
            } else {
                nums1[index++] = nums2[j++];
            }
        }
        if (i == m) {
            while (j < n) {
                nums1[index++] = nums2[j++];
            }
        } else {
            while (i < m) {
                nums1[index++] = newArray[i++];
            }
        }
    }
}
