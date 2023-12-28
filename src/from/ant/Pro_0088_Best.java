package from.ant;

public class Pro_0088_Best {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }

        int[] res = new int[nums1.length];


        int firstIndex = 0;
        int secondIndex = 0;
        int resIndex = 0;
        while (firstIndex < m || secondIndex < n) {
            if(firstIndex == m){
                res[resIndex++] = nums2[secondIndex++];
                continue;
            }

            if(secondIndex == n){
                res[resIndex++] = nums1[firstIndex++];
                continue;
            }

            if (nums1[firstIndex] > nums2[secondIndex]) {
                res[resIndex++] = nums2[secondIndex++];
            } else {
                res[resIndex++] = nums1[firstIndex++];
            }
        }

        for (int i = 0; i < res.length; i++) {
            nums1[i] = res[i];
        }
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4, 5, 6, 0};
        int[] nums2 = new int[]{3};
        new Pro_0088_Best().merge(nums1, 5, nums2, 1);
        System.out.println(MyUtils.printArray(nums1));
    }
}
