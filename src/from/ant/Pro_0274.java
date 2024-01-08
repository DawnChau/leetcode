package from.ant;

import java.util.Arrays;

public class Pro_0274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            // h指数逐渐增加，
            // h指数为1，代表应该有1篇论文的引用量大于等于1
            // h指数为2，代表应该有2篇论文的引用量大于等于2
            // 即 citations[i] 应该大于等于hIndex
            hIndex++;
            // 如果遇到不符合条件的了，返回最大的hIndex
            if (citations[i] < hIndex) {
                return hIndex - 1;
            }
        }
        // 如果全部都符合条件，返回hIndex
        return hIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 4, 4};
        System.out.println(new Pro_0274().hIndex(nums));
    }
}
