package from.ant;

/**
 * 寻找两个正序数组的中位数
 * 思路：做一次归并
 */
public class Pro_0004 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;
        int count = length1 + length2;

        if (count % 2 == 1) {
            int targetIndex = count / 2;

            return findByOdd(nums1, nums2, targetIndex);
        } else {

            int targetIndex = (count / 2) - 1;

            return findByEven(nums1, nums2, targetIndex);
        }
    }

    /**
     * 偶数返回两个中间值的平均值
     *
     * @param nums1
     * @param nums2
     * @param targetIndex
     * @return
     */
    private double findByEven(int[] nums1, int[] nums2, int targetIndex) {
        int firstIndex = 0;
        int secondIndex = 0;
        int res1 = 0;
        int res2 = 0;
        int res = 0;
        for (int i = 0; i <= targetIndex + 1; i++) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            // 边界处理
            if (firstIndex < nums1.length) {
                first = nums1[firstIndex];
            }
            if (secondIndex < nums2.length) {
                second = nums2[secondIndex];
            }

            if (first < second) {
                res = first;
                firstIndex++;
            } else {
                res = second;
                secondIndex++;
            }

            if (i == targetIndex) {
                res1 = res;
            }

            if (i == targetIndex + 1) {
                res2 = res;
            }
        }
        return (res1 + res2) / 2.0;
    }

    /**
     * 奇数直接返回中间值
     *
     * @param nums1
     * @param nums2
     * @param targetIndex
     * @return
     */
    private double findByOdd(int[] nums1, int[] nums2, int targetIndex) {

        int firstIndex = 0;
        int secondIndex = 0;
        int res = 0;
        for (int i = 0; i <= targetIndex; i++) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            // 边界处理
            if (firstIndex < nums1.length) {
                first = nums1[firstIndex];
            }
            if (secondIndex < nums2.length) {
                second = nums2[secondIndex];
            }

            if (first < second) {
                res = first;
                firstIndex++;
            } else {
                res = second;
                secondIndex++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        System.out.println(new Pro_0004().findMedianSortedArrays(nums1, nums2));
    }
}
