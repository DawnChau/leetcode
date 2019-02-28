/**
 * 计算素数的个数
 */
public class Pro_204 {
    public static  int countPrimes(int n) {
        // 默认为false
        boolean[] a = new boolean[n+1];
        int count = 0;
        for(int i = 2;i<n;i++){
            if(a[i]==false){
                count++;

                for(int j = 2;j*i<n;j++){
                    a[j*i] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
