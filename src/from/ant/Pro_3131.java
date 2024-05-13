package from.ant;

public class Pro_3131 {

    public int addedInteger(int[] nums1, int[] nums2) {
        int x = 0;
        int max1 = nums1[0];
        int max2 = nums2[0];

        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > max1) {
                max1 = nums1[i];
            }
        }
        for (int j = 1; j < nums2.length; j++) {
            if (nums2[j] > max2) {
                max2 = nums2[j];
            }
        }

        x = max2 - max1;
        return x;

    }
}
