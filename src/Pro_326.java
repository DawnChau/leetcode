/**
 * 求一个数是否是三的幂
 */
public class Pro_326 {
    public boolean isPowerOfThree(int n) {
        double temp = Math.log10(n)/Math.log10(3);
        return (temp-(int)temp)==0;
    }
}
