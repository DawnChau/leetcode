/**
 * 求阶乘最后零的个数
 * 一个5提供一个0，一个25提供两个零
 */
public class Pro_172 {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n>0){
            ans+=n/5;
            n/=5;
        }
        return ans;
    }
}
