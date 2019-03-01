/**
 * 不用+，求和两个数
 */
public class Pro_371 {
    public int getSum(int a, int b) {
        if(b==0)
            return a;
        // 异或是不带进位的求和
        int sum = a ^ b;
        // 求进位
        int carry = (a & b) << 1;
        // 进位为0的时候，直接返回sum
        return getSum(sum,carry);
    }
}
