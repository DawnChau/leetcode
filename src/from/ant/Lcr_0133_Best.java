package from.ant;

public class Lcr_0133_Best {

    // 不是最优解
    public int hammingWeight1(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    // 耗时最优
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n | 1) == n) {
                count++;
            }
            // 高位补0
            n = n >>> 1;
        }
        return count;
    }
}
