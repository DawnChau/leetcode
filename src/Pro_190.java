/**
 * 32位反转
 */
public class Pro_190 {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            // 如果n的最低为是1
            if ((n & 1) == 1) {
                // 将ans的最低位置为1
                ans++;
            }
            n >>= 1;
        }
        return ans;
    }
}
