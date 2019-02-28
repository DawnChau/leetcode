/**
 * 计算二进制中1的个数
 */
public class Pro_191 {
    public int hammingWeight(int n) {
        int ans = 0;
        while(n!=0){
            ans+=n&1;
            // 无符号右移，高位补零
            n>>>=1;
        }
        return 0;
    }
}
